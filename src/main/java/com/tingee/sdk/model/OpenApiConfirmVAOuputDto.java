package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiConfirmVAOuputDto {
    @JsonProperty("accountType")
    private String accounttype;
    @JsonProperty("bankName")
    private String bankname;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;

    public OpenApiConfirmVAOuputDto() {
    }

    public String getAccounttype() {

        return accounttype;

    }

    public String getBankname() {

        return bankname;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public void setAccounttype(String accounttype) {

        this.accounttype = accounttype;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }
}
