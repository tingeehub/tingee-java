package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class TPBInfoDto {
    @JsonProperty("accountName")
    private String accountname;

    public TPBInfoDto() {
    }

    public String getAccountname() {

        return accountname;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }
}
