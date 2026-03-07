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
public class BankCreateVAOuputDto {
    @lombok.NonNull
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @lombok.NonNull
    @JsonProperty("merchantAccountNumberId")
    private Integer merchantAccountNumberId;
    @JsonProperty("shopId")
    private Integer shopId;
    @lombok.NonNull
    @JsonProperty("status")
    private StatusMerchantAccountNumberEnum status;
    @JsonProperty("confirmId")
    private String confirmId;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("deepLink")
    private String deepLink;
    @JsonProperty("otpMethod")
    private OtpStbConfirmMethodEnum otpMethod;

    /** Use this constructor to set all required fields. */
    public BankCreateVAOuputDto(BankNameEnum bankName, Integer merchantAccountNumberId, StatusMerchantAccountNumberEnum status) {
        this.bankName = bankName;
        this.merchantAccountNumberId = merchantAccountNumberId;
        this.status = status;
    }
}
