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
public class OpenApiBillInfoDto {
    @lombok.NonNull
    @JsonProperty("billId")
    private String billId;
    @lombok.NonNull
    @JsonProperty("qrCodeType")
    private String qrCodeType;
    @lombok.NonNull
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @lombok.NonNull
    @JsonProperty("qrAccount")
    private String qrAccount;
    @lombok.NonNull
    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("totalAmountPaid")
    private Long totalAmountPaid;
    @lombok.NonNull
    @JsonProperty("totalPaymentsCount")
    private Integer totalPaymentsCount;
    @lombok.NonNull
    @JsonProperty("expireInMinute")
    private Integer expireInMinute;
    @JsonProperty("extraInfo")
    private String extraInfo;
    @lombok.NonNull
    @JsonProperty("status")
    private String status;

    /** Use this constructor to set all required fields. */
    public OpenApiBillInfoDto(String billId, String qrCodeType, String bankBin, String accountNumber, String vaAccountNumber, String qrAccount, Long amount, Integer totalPaymentsCount, Integer expireInMinute, String status) {
        this.billId = billId;
        this.qrCodeType = qrCodeType;
        this.bankBin = bankBin;
        this.accountNumber = accountNumber;
        this.vaAccountNumber = vaAccountNumber;
        this.qrAccount = qrAccount;
        this.amount = amount;
        this.totalPaymentsCount = totalPaymentsCount;
        this.expireInMinute = expireInMinute;
        this.status = status;
    }
}
