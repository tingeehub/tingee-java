package vn.tingee.sdk.types;

import lombok.Data;
import java.util.List;

/**
 * Shape of the JSON body sent by Tingee webhook callbacks.
 * Compatible with Spring @RequestBody, Jackson deserialization.
 *
 * Usage in Spring controller:
 * <pre>{@code
 * @PostMapping("/webhook")
 * public ResponseEntity<?> webhook(
 *     @RequestHeader("x-signature") String signature,
 *     @RequestHeader("x-request-timestamp") String timestamp,
 *     @RequestBody TingeeWebhookBody body
 * ) {
 *     var result = TingeeSigner.verifyWebhookSignature(secretToken, signature, timestamp, body);
 *     if (!result.isValid()) return ResponseEntity.status(401).body(result);
 *     // process ...
 * }
 * }</pre>
 */
@Data
public class TingeeWebhookBody {

    @Data
    public static class AdditionalData {
        private String name;
        private String value;
    }

    private String clientId;
    private String transactionCode;
    private Number amount;
    private String content;           // optional
    private String bank;
    private String bankBin;           // optional
    private String accountNumber;
    private String vaAccountNumber;   // optional
    /** Format: yyyyMMddHHmmss */
    private String transactionDate;
    private List<AdditionalData> additionalData; // optional
}
