package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class BankDeleteVAOutputDto {
    @JsonProperty("confirmId")
    private String confirmid;

    public BankDeleteVAOutputDto() {
    }

    public String getConfirmid() {

        return confirmid;

    }

    public void setConfirmid(String confirmid) {

        this.confirmid = confirmid;

    }
}
