package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class VCBInfoDto {
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("baasDto")
    private VCBBaasDto baasdto;

    public VCBInfoDto() {
    }

    public String getAccountname() {

        return accountname;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getMobile() {

        return mobile;

    }

    public VCBBaasDto getBaasdto() {

        return baasdto;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setMobile(String mobile) {

        this.mobile = mobile;

    }

    public void setBaasdto(VCBBaasDto baasdto) {

        this.baasdto = baasdto;

    }
}
