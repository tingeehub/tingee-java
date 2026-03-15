package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class MSBConfigBusinessDto {
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @lombok.NonNull
    @JsonProperty("mobile")
    private String mobile;
    @lombok.NonNull
    @JsonProperty("merchantId")
    private String merchantId;
    @lombok.NonNull
    @JsonProperty("terminalId")
    private String terminalId;
    @lombok.NonNull
    @JsonProperty("accessCode")
    private String accessCode;
    @lombok.NonNull
    @JsonProperty("referralCode")
    private String referralCode;

    /** Use this constructor to set all required fields. */
    public MSBConfigBusinessDto(String accountNumber, String vaPrefix, String mobile, String merchantId, String terminalId, String accessCode, String referralCode) {
        this.accountNumber = accountNumber;
        this.vaPrefix = vaPrefix;
        this.mobile = mobile;
        this.merchantId = merchantId;
        this.terminalId = terminalId;
        this.accessCode = accessCode;
        this.referralCode = referralCode;
    }
}
