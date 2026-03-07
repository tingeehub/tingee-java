package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class OpenApiGetVAPagedOuputDto {
    @lombok.NonNull
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @JsonProperty("bankBin")
    private String bankBin;
    @lombok.NonNull
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @JsonProperty("accountName")
    private String accountName;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @lombok.NonNull
    @JsonProperty("shopId")
    private Integer shopId;
    @lombok.NonNull
    @JsonProperty("status")
    private StatusMerchantAccountNumberEnum status;
    @JsonProperty("creationTime")
    private LocalDateTime creationTime;

    /** Use this constructor to set all required fields. */
    public OpenApiGetVAPagedOuputDto(BankNameEnum bankName, BankAccountTypeEnum accountType, String accountNumber, Integer shopId, StatusMerchantAccountNumberEnum status) {
        this.bankName = bankName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.shopId = shopId;
        this.status = status;
    }
}
