package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiPaymentTransactionStatusResponseDto {
    @JsonProperty("transactionId")
    private String transactionid;
    @JsonProperty("subscriptionId")
    private String subscriptionid;
    @JsonProperty("tokenRef")
    private String tokenref;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("customer")
    private CustomerInfoDto customer;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("code")
    private String code;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("content")
    private String content;
    @JsonProperty("transactionDate")
    private LocalDateTime transactiondate;
    @JsonProperty("status")
    private String status;

    public OpenApiPaymentTransactionStatusResponseDto() {
    }

    public String getTransactionid() {

        return transactionid;

    }

    public String getSubscriptionid() {

        return subscriptionid;

    }

    public String getTokenref() {

        return tokenref;

    }

    public String getBankbin() {

        return bankbin;

    }

    public CustomerInfoDto getCustomer() {

        return customer;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getAccountname() {

        return accountname;

    }

    public String getCode() {

        return code;

    }

    public Double getAmount() {

        return amount;

    }

    public String getCurrency() {

        return currency;

    }

    public String getContent() {

        return content;

    }

    public LocalDateTime getTransactiondate() {

        return transactiondate;

    }

    public String getStatus() {

        return status;

    }

    public void setTransactionid(String transactionid) {

        this.transactionid = transactionid;

    }

    public void setSubscriptionid(String subscriptionid) {

        this.subscriptionid = subscriptionid;

    }

    public void setTokenref(String tokenref) {

        this.tokenref = tokenref;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setCustomer(CustomerInfoDto customer) {

        this.customer = customer;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setCode(String code) {

        this.code = code;

    }

    public void setAmount(Double amount) {

        this.amount = amount;

    }

    public void setCurrency(String currency) {

        this.currency = currency;

    }

    public void setContent(String content) {

        this.content = content;

    }

    public void setTransactiondate(LocalDateTime transactiondate) {

        this.transactiondate = transactiondate;

    }

    public void setStatus(String status) {

        this.status = status;

    }
}
