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
public class OpenApiTransactionPagedOuputDto {
    @lombok.NonNull
    @JsonProperty("transactionId")
    private String transactionId;
    @lombok.NonNull
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("shopId")
    private Integer shopId;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("cashFlowSource")
    private CashFlowSourceEnum cashFlowSource;
    @lombok.NonNull
    @JsonProperty("code")
    private String code;
    @lombok.NonNull
    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("type")
    private String type;
    @JsonProperty("content")
    private String content;
    @JsonProperty("currency")
    private String currency;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("transactionDate")
    private String transactionDate;
    @JsonProperty("billId")
    private String billId;

    /** Use this constructor to set all required fields. */
    public OpenApiTransactionPagedOuputDto(String transactionId, Integer merchantId, Integer shopId, String code, Long amount, String accountNumber) {
        this.transactionId = transactionId;
        this.merchantId = merchantId;
        this.shopId = shopId;
        this.code = code;
        this.amount = amount;
        this.accountNumber = accountNumber;
    }
}
