package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiConfigAccountBusinessDto {
    @JsonProperty("bankName")
    private String bankname;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("acbUserId")
    private String acbuserid;
    @JsonProperty("bankBin")
    private String bankbin;

    public OpenApiConfigAccountBusinessDto() {
    }

    public String getBankname() {

        return bankname;

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

    public String getVaprefix() {

        return vaprefix;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getAcbuserid() {

        return acbuserid;

    }

    public String getBankbin() {

        return bankbin;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

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

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setAcbuserid(String acbuserid) {

        this.acbuserid = acbuserid;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }
}
