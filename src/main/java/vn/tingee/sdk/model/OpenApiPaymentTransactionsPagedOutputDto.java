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
public class OpenApiPaymentTransactionsPagedOutputDto {
    @lombok.NonNull
    @JsonProperty("transactionId")
    private String transactionId;
    @lombok.NonNull
    @JsonProperty("code")
    private String code;
    @lombok.NonNull
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @lombok.NonNull
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @lombok.NonNull
    @JsonProperty("amount")
    private String amount;
    @lombok.NonNull
    @JsonProperty("content")
    private String content;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("transactionDate")
    private LocalDateTime transactionDate;
    @lombok.NonNull
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    @lombok.NonNull
    @JsonProperty("tokenRef")
    private String tokenRef;
    @lombok.NonNull
    @JsonProperty("status")
    private DirectDebitTransactionStatusEnum status;
    @JsonProperty("additionalData")
    private Object additionalData;

    /** Use this constructor to set all required fields. */
    public OpenApiPaymentTransactionsPagedOutputDto(String transactionId, String code, BankNameEnum bankName, String bankBin, String amount, String content, String accountNumber, LocalDateTime transactionDate, String subscriptionId, String tokenRef, DirectDebitTransactionStatusEnum status) {
        this.transactionId = transactionId;
        this.code = code;
        this.bankName = bankName;
        this.bankBin = bankBin;
        this.amount = amount;
        this.content = content;
        this.accountNumber = accountNumber;
        this.transactionDate = transactionDate;
        this.subscriptionId = subscriptionId;
        this.tokenRef = tokenRef;
        this.status = status;
    }
}
