package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class PGBInfoDto {
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("identity")
    private String identity;
    @JsonProperty("mobile")
    private String mobile;

    public PGBInfoDto() {
    }

    public String getAccountname() {

        return accountname;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getIdentity() {

        return identity;

    }

    public String getMobile() {

        return mobile;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setIdentity(String identity) {

        this.identity = identity;

    }

    public void setMobile(String mobile) {

        this.mobile = mobile;

    }
}
