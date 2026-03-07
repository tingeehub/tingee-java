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
public class OpenApiConfirmVAOuputDto {
    @lombok.NonNull
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @lombok.NonNull
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;

    /** Use this constructor to set all required fields. */
    public OpenApiConfirmVAOuputDto(BankAccountTypeEnum accountType, BankNameEnum bankName, String accountNumber, String vaAccountNumber) {
        this.accountType = accountType;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.vaAccountNumber = vaAccountNumber;
    }
}
