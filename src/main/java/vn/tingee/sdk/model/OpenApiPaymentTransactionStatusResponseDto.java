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
public class OpenApiPaymentTransactionStatusResponseDto {
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    @lombok.NonNull
    @JsonProperty("tokenRef")
    private String tokenRef;
    @lombok.NonNull
    @JsonProperty("bankBin")
    private String bankBin;
    @lombok.NonNull
    @JsonProperty("customer")
    private CustomerInfoDto customer;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("accountName")
    private String accountName;
    @JsonProperty("code")
    private String code;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("content")
    private String content;
    @JsonProperty("transactionDate")
    private LocalDateTime transactionDate;
    @lombok.NonNull
    @JsonProperty("status")
    private WebhookStatusEnum status;

    /** Use this constructor to set all required fields. */
    public OpenApiPaymentTransactionStatusResponseDto(String tokenRef, String bankBin, CustomerInfoDto customer, WebhookStatusEnum status) {
        this.tokenRef = tokenRef;
        this.bankBin = bankBin;
        this.customer = customer;
        this.status = status;
    }
}
