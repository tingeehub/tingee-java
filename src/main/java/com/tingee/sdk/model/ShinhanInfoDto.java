package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class ShinhanInfoDto {
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("merchantName")
    private String merchantname;

    public ShinhanInfoDto() {
    }

    public String getVaprefix() {

        return vaprefix;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getMerchantname() {

        return merchantname;

    }

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setMerchantname(String merchantname) {

        this.merchantname = merchantname;

    }
}
