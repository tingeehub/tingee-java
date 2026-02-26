package com.tingee.sdk.signature;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utility class for generating HMAC-SHA512 signatures for Tingee API requests
 */
public class SignatureUtils {
    private static final String HMAC_SHA512 = "HmacSHA512";
    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Generate signature for Tingee API request
     * 
     * Signature format: HMAC-SHA512(secretKey, timestamp:JSON.stringify(body))
     * 
     * @param secretKey Secret key for HMAC
     * @param timestamp Request timestamp in format yyyyMMddHHmmssSSS
     * @param body Request body object (will be JSON stringified)
     * @return Hex-encoded signature string
     */
    public static String generateSignature(String secretKey, String timestamp, Object body) {
        try {
            String jsonBody = body == null ? "{}" : objectMapper.writeValueAsString(body);
            
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
     * Format current date/time to Tingee timestamp format: yyyyMMddHHmmssSSS
     * 
     * @return Formatted timestamp string
     */
    public static String formatTimestamp() {
        return formatTimestamp(LocalDateTime.now());
    }

    /**
     * Format date/time to Tingee timestamp format: yyyyMMddHHmmssSSS
     * 
     * @param dateTime LocalDateTime to format
     * @return Formatted timestamp string
     */
    public static String formatTimestamp(LocalDateTime dateTime) {
        String base = dateTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        int millis = dateTime.getNano() / 1_000_000;
        return base + String.format("%03d", millis);
    }
}
