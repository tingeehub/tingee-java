package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiPaymentTransactionsPagedOutputDto {
    @JsonProperty("transactionId")
    private String transactionid;
    @JsonProperty("code")
    private String code;
    @JsonProperty("bankName")
    private String bankname;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("content")
    private String content;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("transactionDate")
    private LocalDateTime transactiondate;
    @JsonProperty("subscriptionId")
    private String subscriptionid;
    @JsonProperty("tokenRef")
    private String tokenref;
    @JsonProperty("status")
    private String status;
    @JsonProperty("additionalData")
    private Object additionaldata;

    public OpenApiPaymentTransactionsPagedOutputDto() {
    }

    public String getTransactionid() {

        return transactionid;

    }

    public String getCode() {

        return code;

    }

    public String getBankname() {

        return bankname;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getAmount() {

        return amount;

    }

    public String getContent() {

        return content;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public LocalDateTime getTransactiondate() {

        return transactiondate;

    }

    public String getSubscriptionid() {

        return subscriptionid;

    }

    public String getTokenref() {

        return tokenref;

    }

    public String getStatus() {

        return status;

    }

    public Object getAdditionaldata() {

        return additionaldata;

    }

    public void setTransactionid(String transactionid) {

        this.transactionid = transactionid;

    }

    public void setCode(String code) {

        this.code = code;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setAmount(String amount) {

        this.amount = amount;

    }

    public void setContent(String content) {

        this.content = content;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setTransactiondate(LocalDateTime transactiondate) {

        this.transactiondate = transactiondate;

    }

    public void setSubscriptionid(String subscriptionid) {

        this.subscriptionid = subscriptionid;

    }

    public void setTokenref(String tokenref) {

        this.tokenref = tokenref;

    }

    public void setStatus(String status) {

        this.status = status;

    }

    public void setAdditionaldata(Object additionaldata) {

        this.additionaldata = additionaldata;

    }
}
