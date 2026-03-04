package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiGenerateVietQRInputDto {
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private String bankname;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("content")
    private String content;

    public OpenApiGenerateVietQRInputDto() {
    }

    public String getBankbin() {

        return bankbin;

    }

    public String getBankname() {

        return bankname;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public Double getAmount() {

        return amount;

    }

    public String getContent() {

        return content;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setAmount(Double amount) {

        this.amount = amount;

    }

    public void setContent(String content) {

        this.content = content;

    }
}
