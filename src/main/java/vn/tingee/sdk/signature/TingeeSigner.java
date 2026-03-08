package vn.tingee.sdk.signature;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


/**
 * Tingee webhook signature utilities.
 */
public final class TingeeSigner {

    private TingeeSigner() {}

    private static final String HMAC_ALGO = "HmacSHA512";


    /** Timestamp format: yyyyMMddHHmmssSSS */
    private static final DateTimeFormatter TIMESTAMP_FMT =
            DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static final class WebhookVerifyResult {
        private final String code;
        private final String message;

        private WebhookVerifyResult(String code, String message) {
            this.code    = code;
            this.message = message;
        }

        public String  getCode()    { return code; }
        public String  getMessage() { return message; }
        public boolean isValid()    { return "00".equals(code); }

        @Override
        public String toString() {
            return "WebhookVerifyResult{code='" + code + "', message='" + message + "'}";
        }
    }

    /**
     * Generate HMAC-SHA512 signature.
     * message = "{timestamp}:{json_body}"
     */
    public static String generateSignature(String secretKey, String timestamp, Object body) throws Exception {
        String bodyJson = MAPPER.writeValueAsString(body);
        String message  = timestamp + ":" + bodyJson;

        Mac mac = Mac.getInstance(HMAC_ALGO);
        mac.init(new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), HMAC_ALGO));
        byte[] raw = mac.doFinal(message.getBytes(StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder(raw.length * 2);
        for (byte b : raw) sb.append(String.format("%02x", b));
        return sb.toString();
    }

    /**
     * Format a LocalDateTime to Tingee timestamp format: yyyyMMddHHmmssSSS
     */
    public static String formatTimestamp(LocalDateTime dt) {
        return dt.format(TIMESTAMP_FMT);
    }

    /**
     * Format current Vietnam time (UTC+7) to Tingee timestamp format.
     * Tingee API validates timestamps within Â±10 minutes of server time (Vietnam timezone).
     */
    public static String formatTimestamp() {
        // Explicitly use Vietnam timezone to avoid clock skew on UTC-hosted servers
        ZonedDateTime vnNow = ZonedDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        return formatTimestamp(vnNow.toLocalDateTime());
    }

    /**
     * Verify the HMAC-SHA512 signature of an incoming Tingee webhook callback.
     *
     * <pre>{@code
     * WebhookVerifyResult result = TingeeSigner.verifyWebhookSignature(
     *     secretToken, // from your merchant config
     *     request.getHeader("x-signature"),
     *     request.getHeader("x-request-timestamp"),
     *     body         // TingeeWebhookBody parsed from the JSON body
     * );
     * if (!result.isValid()) {
     *     response.setStatus(401);
     *     return result;
     * }
     * }</pre>
     */
    public static WebhookVerifyResult verifyWebhookSignature(
            String secretToken,
            String signature,
            String timestamp,
            Object body
    ) {
        if (signature == null || signature.isEmpty()) {
            return new WebhookVerifyResult("MISSING_SIGNATURE", "x-signature header is required");
        }
        if (timestamp == null || timestamp.isEmpty()) {
            return new WebhookVerifyResult("MISSING_TIMESTAMP", "x-request-timestamp header is required");
        }
        if (!timestamp.matches("^\\d{17}$")) {
            return new WebhookVerifyResult("INVALID_TIMESTAMP",
                    "x-request-timestamp must be in yyyyMMddHHmmssSSS format (17 digits)");
        }
        if (body == null) {
            return new WebhookVerifyResult("MISSING_BODY", "body is required and must be an object");
        }

        // Convert object to Map for field validation
        @SuppressWarnings("unchecked")
        java.util.Map<String, Object> map = MAPPER.convertValue(body, java.util.Map.class);

        // Check required fields
        String[] requiredFields = {"clientId", "transactionCode", "amount", "bank", "accountNumber", "transactionDate"};
        for (String field : requiredFields) {
            Object val = map.get(field);
            if (val == null || val.toString().isEmpty()) {
                return new WebhookVerifyResult("MISSING_BODY_FIELD", "body." + field + " is required");
            }
        }

        try {
            String expected = generateSignature(secretToken, timestamp, body);
            // Timing-safe comparison
            byte[] expectedBytes = expected.getBytes(StandardCharsets.UTF_8);
            byte[] actualBytes   = signature.toLowerCase().getBytes(StandardCharsets.UTF_8);
            if (!MessageDigest.isEqual(expectedBytes, actualBytes)) {
                return new WebhookVerifyResult("INVALID_SIGNATURE", "Signature does not match");
            }
        } catch (Exception e) {
            return new WebhookVerifyResult("INVALID_SIGNATURE", "Signature format is invalid");
        }

        return new WebhookVerifyResult("00", "Success");
    }

    /**
     * Verify webhook signature where body is a raw JSON string.
     * Parsed automatically into a Map.
     */
    public static WebhookVerifyResult verifyWebhookSignature(
            String secretToken,
            String signature,
            String timestamp,
            String bodyJson
    ) {
        if (bodyJson == null || bodyJson.isBlank()) {
            return new WebhookVerifyResult("MISSING_BODY", "body is required and must be an object");
        }
        try {
            Object parsed = MAPPER.readValue(bodyJson, Object.class);
            return verifyWebhookSignature(secretToken, signature, timestamp, parsed);
        } catch (Exception e) {
            return new WebhookVerifyResult("INVALID_BODY", "body string is not valid JSON");
        }
    }

}


