package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiEditConfirmBeforePaymentMethodDto {
    @JsonProperty("requestId")
    private String requestid;
    @JsonProperty("returnUrl")
    private String returnurl;
    @JsonProperty("subscriptionId")
    private String subscriptionid;

    public OpenApiEditConfirmBeforePaymentMethodDto() {
    }

    public String getRequestid() {

        return requestid;

    }

    public String getReturnurl() {

        return returnurl;

    }

    public String getSubscriptionid() {

        return subscriptionid;

    }

    public void setRequestid(String requestid) {

        this.requestid = requestid;

    }

    public void setReturnurl(String returnurl) {

        this.returnurl = returnurl;

    }

    public void setSubscriptionid(String subscriptionid) {

        this.subscriptionid = subscriptionid;

    }
}
