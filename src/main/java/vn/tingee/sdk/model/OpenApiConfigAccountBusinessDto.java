package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiConfigAccountBusinessDto {
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("accountName")
    private String accountName;
    @lombok.NonNull
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("acbUserId")
    private String acbUserId;
    @JsonProperty("bankBin")
    private String bankBin;

    /** Use this constructor to set all required fields. */
    public OpenApiConfigAccountBusinessDto(String accountNumber, String accountName, String mobile, String acbUserId) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.mobile = mobile;
        this.acbUserId = acbUserId;
    }
}
