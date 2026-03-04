package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiRefundDto {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("transactionCode")
    private String transactioncode;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private String bankname;

    public OpenApiRefundDto() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getTransactioncode() {

        return transactioncode;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getBankname() {

        return bankname;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setTransactioncode(String transactioncode) {

        this.transactioncode = transactioncode;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }
}
