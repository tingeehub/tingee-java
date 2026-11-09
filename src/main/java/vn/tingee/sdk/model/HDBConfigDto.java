package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class HDBConfigDto {
    @lombok.NonNull
    @JsonProperty("secretKey")
    private String secretKey;
    @lombok.NonNull
    @JsonProperty("merchantId")
    private String merchantId;
    @lombok.NonNull
    @JsonProperty("terminalId")
    private String terminalId;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("accountName")
    private String accountName;

    /** Use this constructor to set all required fields. */
    public HDBConfigDto(String secretKey, String merchantId, String terminalId, String accountNumber, String accountName) {
        this.secretKey = secretKey;
        this.merchantId = merchantId;
        this.terminalId = terminalId;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }
}
