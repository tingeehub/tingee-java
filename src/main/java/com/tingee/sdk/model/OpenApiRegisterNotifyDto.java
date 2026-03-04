package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiRegisterNotifyDto {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private String bankname;

    public OpenApiRegisterNotifyDto() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

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

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }
}
