package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiRefundInputDto {
    @lombok.NonNull
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    @lombok.NonNull
    @JsonProperty("tokenRef")
    private String tokenRef;
    @lombok.NonNull
    @JsonProperty("transactionId")
    private String transactionId;
    @lombok.NonNull
    @JsonProperty("amount")
    private Long amount;

    /** Use this constructor to set all required fields. */
    public OpenApiRefundInputDto(String subscriptionId, String tokenRef, String transactionId, Long amount) {
        this.subscriptionId = subscriptionId;
        this.tokenRef = tokenRef;
        this.transactionId = transactionId;
        this.amount = amount;
    }
}
