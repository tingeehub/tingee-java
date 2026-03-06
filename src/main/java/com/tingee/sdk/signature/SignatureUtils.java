package com.tingee.sdk.signature;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utility class for generating HMAC-SHA512 signatures for Tingee API requests
 */
public class SignatureUtils {
    private static final String HMAC_SHA512 = "HmacSHA512";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final ZoneId VIETNAM_ZONE = ZoneId.of("Asia/Ho_Chi_Minh");
    private static final DateTimeFormatter TIMESTAMP_FMT =
            DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    /**
     * Generate signature for Tingee API request.
     *
     * Signature format: HMAC-SHA512(secretKey, timestamp + ":" + JSON.stringify(body))
     * Matches Node.js: JSON.stringify(null) === "null", JSON.stringify({}) === "{}"
     *
     * @param secretKey Secret key for HMAC
     * @param timestamp Request timestamp in format yyyyMMddHHmmssSSS
     * @param body      Request body object (null serializes to "null", same as JSON.stringify)
     * @return Hex-encoded signature string
     */
    public static String generateSignature(String secretKey, String timestamp, Object body) {
        try {
            // JSON.stringify(null) === "null" in JavaScript — match that behaviour
            String jsonBody = objectMapper.writeValueAsString(body);

            String message = timestamp + ":" + jsonBody;

            Mac mac = Mac.getInstance(HMAC_SHA512);
            SecretKeySpec secretKeySpec = new SecretKeySpec(
                secretKey.getBytes(StandardCharsets.UTF_8),
                HMAC_SHA512
            );
            mac.init(secretKeySpec);

            byte[] hash = mac.doFinal(message.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate signature", e);
        }
    }

    /**
     * Format current time to Tingee timestamp format: yyyyMMddHHmmssSSS
     * Always uses Vietnam timezone (UTC+7), regardless of machine timezone.
     * Matches Node.js signer.ts behaviour.
     *
     * @return Formatted timestamp string (17 digits)
     */
    public static String formatTimestamp() {
        return formatTimestamp(Instant.now());
    }

    /**
     * Format an Instant to Tingee timestamp format: yyyyMMddHHmmssSSS
     * Always uses Vietnam timezone (UTC+7).
     *
     * @param instant Instant to format
     * @return Formatted timestamp string (17 digits)
     */
    public static String formatTimestamp(Instant instant) {
        ZonedDateTime vnTime = instant.atZone(VIETNAM_ZONE);
        String base = vnTime.format(TIMESTAMP_FMT);
        int millis = vnTime.getNano() / 1_000_000;
        return base + String.format("%03d", millis);
    }
}
