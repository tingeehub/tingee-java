package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class BIDVInfoDto {
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("merchantName")
    private String merchantname;
    @JsonProperty("merchantAddress")
    private String merchantaddress;
    @JsonProperty("accountNo")
    private String accountno;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("identity")
    private String identity;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("email")
    private String email;

    public BIDVInfoDto() {
    }

    public String getVaprefix() {

        return vaprefix;

    }

    public String getMerchantname() {

        return merchantname;

    }

    public String getMerchantaddress() {

        return merchantaddress;

    }

    public String getAccountno() {

        return accountno;

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

    public String getEmail() {

        return email;

    }

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setMerchantname(String merchantname) {

        this.merchantname = merchantname;

    }

    public void setMerchantaddress(String merchantaddress) {

        this.merchantaddress = merchantaddress;

    }

    public void setAccountno(String accountno) {

        this.accountno = accountno;

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

    public void setEmail(String email) {

        this.email = email;

    }
}
