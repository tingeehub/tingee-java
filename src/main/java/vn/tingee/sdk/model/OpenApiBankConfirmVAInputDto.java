package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiBankConfirmVAInputDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("confirmId")
    private String confirmId;
    @lombok.NonNull
    @JsonProperty("otpNumber")
    private String otpNumber;
    @lombok.NonNull
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @lombok.NonNull
    @JsonProperty("bankBin")
    private String bankBin;

    /** Use this constructor to set all required fields. */
    public OpenApiBankConfirmVAInputDto(String confirmId, String otpNumber, BankNameEnum bankName, String bankBin) {
        this.confirmId = confirmId;
        this.otpNumber = otpNumber;
        this.bankName = bankName;
        this.bankBin = bankBin;
    }
}
