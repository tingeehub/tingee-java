package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiPaymentBillDto {
    @lombok.NonNull
    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("clientId")
    private String clientId;
    @lombok.NonNull
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    @lombok.NonNull
    @JsonProperty("amount")
    private String amount;
    @lombok.NonNull
    @JsonProperty("description")
    private String description;
    @JsonProperty("expirationTime")
    private String expirationTime;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("token")
    private String token;
    @JsonProperty("additionalData")
    private Object additionalData;
    @JsonProperty("tokenRef")
    private String tokenRef;
    @lombok.NonNull
    @JsonProperty("partnerCode")
    private DirectDebitPartnerEnum partnerCode;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("serviceProviderName")
    private String serviceProviderName;
    @JsonProperty("returnUrl")
    private String returnUrl;

    /** Use this constructor to set all required fields. */
    public OpenApiPaymentBillDto(String requestId, String subscriptionId, String amount, String description, DirectDebitPartnerEnum partnerCode, String serviceProviderName) {
        this.requestId = requestId;
        this.subscriptionId = subscriptionId;
        this.amount = amount;
        this.description = description;
        this.partnerCode = partnerCode;
        this.serviceProviderName = serviceProviderName;
    }
}
