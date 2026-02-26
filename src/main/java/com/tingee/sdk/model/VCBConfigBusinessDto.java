package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class VCBConfigBusinessDto {
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("merchantId")
    private String merchantid;
    @JsonProperty("terminalId")
    private String terminalid;

    public VCBConfigBusinessDto() {
    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getAccountname() {

        return accountname;

    }

    public String getMerchantid() {

        return merchantid;

    }

    public String getTerminalid() {

        return terminalid;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setMerchantid(String merchantid) {

        this.merchantid = merchantid;

    }

    public void setTerminalid(String terminalid) {

        this.terminalid = terminalid;

    }
}
