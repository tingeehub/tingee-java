package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiReadSecurityCodeDto {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("uuid")
    private String uuid;

    public OpenApiReadSecurityCodeDto() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getUuid() {

        return uuid;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setUuid(String uuid) {

        this.uuid = uuid;

    }
}
