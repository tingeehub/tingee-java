package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class CTGInfoDto {
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("merchantName")
    private String merchantname;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("identity")
    private String identity;
    @JsonProperty("mobile")
    private String mobile;

    public CTGInfoDto() {
    }

    public String getVaprefix() {

        return vaprefix;

    }

    public String getMerchantname() {

        return merchantname;

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

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setMerchantname(String merchantname) {

        this.merchantname = merchantname;

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
}
