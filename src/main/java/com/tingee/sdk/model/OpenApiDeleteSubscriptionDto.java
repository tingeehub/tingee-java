package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiDeleteSubscriptionDto {
    @JsonProperty("requestId")
    private String requestid;
    @JsonProperty("returnUrl")
    private String returnurl;
    @JsonProperty("subscriptionId")
    private String subscriptionid;
    @JsonProperty("tokenRef")
    private String tokenref;

    public OpenApiDeleteSubscriptionDto() {
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

    public String getTokenref() {

        return tokenref;

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

    public void setTokenref(String tokenref) {

        this.tokenref = tokenref;

    }
}
