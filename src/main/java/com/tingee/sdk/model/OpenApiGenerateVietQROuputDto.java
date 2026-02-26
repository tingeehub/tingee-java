package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiGenerateVietQROuputDto {
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("vaSuffix")
    private String vasuffix;

    public OpenApiGenerateVietQROuputDto() {
    }

    public String getBankbin() {

        return bankbin;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getAmount() {

        return amount;

    }

    public String getPurpose() {

        return purpose;

    }

    public String getVaprefix() {

        return vaprefix;

    }

    public String getVasuffix() {

        return vasuffix;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setAmount(String amount) {

        this.amount = amount;

    }

    public void setPurpose(String purpose) {

        this.purpose = purpose;

    }

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setVasuffix(String vasuffix) {

        this.vasuffix = vasuffix;

    }
}
