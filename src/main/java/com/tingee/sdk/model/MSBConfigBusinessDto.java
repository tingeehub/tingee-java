package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class MSBConfigBusinessDto {
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("merchantId")
    private String merchantid;
    @JsonProperty("terminalId")
    private String terminalid;
    @JsonProperty("accessCode")
    private String accesscode;

    public MSBConfigBusinessDto() {
    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getVaprefix() {

        return vaprefix;

    }

    public String getMobile() {

        return mobile;

    }

    public String getMerchantid() {

        return merchantid;

    }

    public String getTerminalid() {

        return terminalid;

    }

    public String getAccesscode() {

        return accesscode;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setMobile(String mobile) {

        this.mobile = mobile;

    }

    public void setMerchantid(String merchantid) {

        this.merchantid = merchantid;

    }

    public void setTerminalid(String terminalid) {

        this.terminalid = terminalid;

    }

    public void setAccesscode(String accesscode) {

        this.accesscode = accesscode;

    }
}
