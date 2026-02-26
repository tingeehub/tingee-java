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
    private BankNameEnum bankname;

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

    public BankNameEnum getBankname() {

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

    public void setBankname(BankNameEnum bankname) {

        this.bankname = bankname;

    }
}
