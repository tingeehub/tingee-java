package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class ACBConfigBusinessDto {
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("acbUserId")
    private String acbuserid;

    public ACBConfigBusinessDto() {
    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getAccountname() {

        return accountname;

    }

    public String getVaprefix() {

        return vaprefix;

    }

    public String getMobile() {

        return mobile;

    }

    public String getAcbuserid() {

        return acbuserid;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setMobile(String mobile) {

        this.mobile = mobile;

    }

    public void setAcbuserid(String acbuserid) {

        this.acbuserid = acbuserid;

    }
}
