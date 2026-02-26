package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiRefundInputDto {
    @JsonProperty("subscriptionId")
    private String subscriptionid;
    @JsonProperty("tokenRef")
    private String tokenref;
    @JsonProperty("transactionId")
    private String transactionid;
    @JsonProperty("amount")
    private Double amount;

    public OpenApiRefundInputDto() {
    }

    public String getSubscriptionid() {

        return subscriptionid;

    }

    public String getTokenref() {

        return tokenref;

    }

    public String getTransactionid() {

        return transactionid;

    }

    public Double getAmount() {

        return amount;

    }

    public void setSubscriptionid(String subscriptionid) {

        this.subscriptionid = subscriptionid;

    }

    public void setTokenref(String tokenref) {

        this.tokenref = tokenref;

    }

    public void setTransactionid(String transactionid) {

        this.transactionid = transactionid;

    }

    public void setAmount(Double amount) {

        this.amount = amount;

    }
}
