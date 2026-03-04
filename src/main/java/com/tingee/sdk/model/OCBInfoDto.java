package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OCBInfoDto {
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("identificationNumber")
    private String identificationnumber;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("registerDate")
    private String registerdate;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;
    @JsonProperty("merchantName")
    private String merchantname;
    @JsonProperty("merchantAddress")
    private String merchantaddress;
    @JsonProperty("mobilePhone")
    private String mobilephone;
    @JsonProperty("email")
    private String email;

    public OCBInfoDto() {
    }

    public String getVaprefix() {

        return vaprefix;

    }

    public String getIdentificationnumber() {

        return identificationnumber;

    }

    public String getAccountname() {

        return accountname;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getRegisterdate() {

        return registerdate;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public String getMerchantname() {

        return merchantname;

    }

    public String getMerchantaddress() {

        return merchantaddress;

    }

    public String getMobilephone() {

        return mobilephone;

    }

    public String getEmail() {

        return email;

    }

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setIdentificationnumber(String identificationnumber) {

        this.identificationnumber = identificationnumber;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setRegisterdate(String registerdate) {

        this.registerdate = registerdate;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }

    public void setMerchantname(String merchantname) {

        this.merchantname = merchantname;

    }

    public void setMerchantaddress(String merchantaddress) {

        this.merchantaddress = merchantaddress;

    }

    public void setMobilephone(String mobilephone) {

        this.mobilephone = mobilephone;

    }

    public void setEmail(String email) {

        this.email = email;

    }
}
