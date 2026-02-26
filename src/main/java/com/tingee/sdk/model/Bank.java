package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class Bank {
    @JsonProperty("code")
    private BankNameEnum code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("shortName")
    private String shortname;
    @JsonProperty("bin")
    private String bin;
    @JsonProperty("urlLogo")
    private String urllogo;
    @JsonProperty("termsAndConditions")
    private Object termsandconditions;

    public Bank() {
    }

    public BankNameEnum getCode() {

        return code;

    }

    public String getName() {

        return name;

    }

    public String getShortname() {

        return shortname;

    }

    public String getBin() {

        return bin;

    }

    public String getUrllogo() {

        return urllogo;

    }

    public Object getTermsandconditions() {

        return termsandconditions;

    }

    public void setCode(BankNameEnum code) {

        this.code = code;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setShortname(String shortname) {

        this.shortname = shortname;

    }

    public void setBin(String bin) {

        this.bin = bin;

    }

    public void setUrllogo(String urllogo) {

        this.urllogo = urllogo;

    }

    public void setTermsandconditions(Object termsandconditions) {

        this.termsandconditions = termsandconditions;

    }
}
