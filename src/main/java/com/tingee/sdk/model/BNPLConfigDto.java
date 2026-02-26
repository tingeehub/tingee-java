package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class BNPLConfigDto {
    @JsonProperty("baokimConfigDto")
    private BaoKimConfigDto baokimconfigdto;

    public BNPLConfigDto() {
    }

    public BaoKimConfigDto getBaokimconfigdto() {

        return baokimconfigdto;

    }

    public void setBaokimconfigdto(BaoKimConfigDto baokimconfigdto) {

        this.baokimconfigdto = baokimconfigdto;

    }
}
