package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiEditConfirmBeforePaymentMethodDto {
    @lombok.NonNull
    @JsonProperty("requestId")
    private String requestId;
    @lombok.NonNull
    @JsonProperty("returnUrl")
    private String returnUrl;
    @lombok.NonNull
    @JsonProperty("subscriptionId")
    private String subscriptionId;

    /** Use this constructor to set all required fields. */
    public OpenApiEditConfirmBeforePaymentMethodDto(String requestId, String returnUrl, String subscriptionId) {
        this.requestId = requestId;
        this.returnUrl = returnUrl;
        this.subscriptionId = subscriptionId;
    }
}
