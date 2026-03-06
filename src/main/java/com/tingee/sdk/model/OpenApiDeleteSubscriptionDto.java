package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiDeleteSubscriptionDto {
    @lombok.NonNull
    @JsonProperty("requestId")
    private String requestId;
    @lombok.NonNull
    @JsonProperty("returnUrl")
    private String returnUrl;
    @lombok.NonNull
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    @lombok.NonNull
    @JsonProperty("tokenRef")
    private String tokenRef;

    /** Use this constructor to set all required fields. */
    public OpenApiDeleteSubscriptionDto(String requestId, String returnUrl, String subscriptionId, String tokenRef) {
        this.requestId = requestId;
        this.returnUrl = returnUrl;
        this.subscriptionId = subscriptionId;
        this.tokenRef = tokenRef;
    }
}
