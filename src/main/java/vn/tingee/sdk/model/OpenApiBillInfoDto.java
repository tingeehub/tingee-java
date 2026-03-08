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
    private Double amount;
    @lombok.NonNull
    @JsonProperty("purpose")
    private String purpose;
    @lombok.NonNull
    @JsonProperty("totalAmountPaid")
    private Double totalAmountPaid;
    @lombok.NonNull
    @JsonProperty("totalPaymentsCount")
    private Double totalPaymentsCount;
    @lombok.NonNull
    @JsonProperty("expireInMinute")
    private Double expireInMinute;
    @JsonProperty("extraInfo")
    private String extraInfo;
    @lombok.NonNull
    @JsonProperty("status")
    private String status;

    /** Use this constructor to set all required fields. */
    public OpenApiBillInfoDto(String billId, String qrCodeType, String bankBin, String accountNumber, String vaAccountNumber, String qrAccount, Double amount, String purpose, Double totalAmountPaid, Double totalPaymentsCount, Double expireInMinute, String status) {
        this.billId = billId;
        this.qrCodeType = qrCodeType;
        this.bankBin = bankBin;
        this.accountNumber = accountNumber;
        this.vaAccountNumber = vaAccountNumber;
        this.qrAccount = qrAccount;
        this.amount = amount;
        this.purpose = purpose;
        this.totalAmountPaid = totalAmountPaid;
        this.totalPaymentsCount = totalPaymentsCount;
        this.expireInMinute = expireInMinute;
        this.status = status;
    }
}
