package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiDeleteConfigBusinessDto {
    @JsonProperty("accountType")
    private String accounttype;
    @JsonProperty("configRemove")
    private ACBConfigBusinessDto configremove;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private String bankname;

    public OpenApiDeleteConfigBusinessDto() {
    }

    public String getAccounttype() {

        return accounttype;

    }

    public ACBConfigBusinessDto getConfigremove() {

        return configremove;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getBankname() {

        return bankname;

    }

    public void setAccounttype(String accounttype) {

        this.accounttype = accounttype;

    }

    public void setConfigremove(ACBConfigBusinessDto configremove) {

        this.configremove = configremove;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }
}
