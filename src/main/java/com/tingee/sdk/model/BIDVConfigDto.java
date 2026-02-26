package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class BIDVConfigDto {
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("bankPartnerId")
    private String bankpartnerid;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("accountName")
    private String accountname;

    public BIDVConfigDto() {
    }

    public String getVaprefix() {

        return vaprefix;

    }

    public String getBankpartnerid() {

        return bankpartnerid;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getAccountname() {

        return accountname;

    }

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setBankpartnerid(String bankpartnerid) {

        this.bankpartnerid = bankpartnerid;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }
}
