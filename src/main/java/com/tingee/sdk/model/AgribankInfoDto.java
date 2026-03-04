package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class AgribankInfoDto {
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("identity")
    private String identity;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("taxCode")
    private String taxcode;
    @JsonProperty("agribankVaId")
    private String agribankvaid;

    public AgribankInfoDto() {
    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getAccountname() {

        return accountname;

    }

    public String getIdentity() {

        return identity;

    }

    public String getMobile() {

        return mobile;

    }

    public String getTaxcode() {

        return taxcode;

    }

    public String getAgribankvaid() {

        return agribankvaid;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setIdentity(String identity) {

        this.identity = identity;

    }

    public void setMobile(String mobile) {

        this.mobile = mobile;

    }

    public void setTaxcode(String taxcode) {

        this.taxcode = taxcode;

    }

    public void setAgribankvaid(String agribankvaid) {

        this.agribankvaid = agribankvaid;

    }
}
