package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class ACBInfoDto {
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("merchantName")
    private String merchantname;
    @JsonProperty("merchantAddress")
    private String merchantaddress;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("email")
    private String email;
    @JsonProperty("acbUserId")
    private String acbuserid;

    public ACBInfoDto() {
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

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getAccountname() {

        return accountname;

    }

    public String getMobile() {

        return mobile;

    }

    public String getEmail() {

        return email;

    }

    public String getAcbuserid() {

        return acbuserid;

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

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setMobile(String mobile) {

        this.mobile = mobile;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public void setAcbuserid(String acbuserid) {

        this.acbuserid = acbuserid;

    }
}
