package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiReadPartnerSecurityCodeDto {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("securityCode")
    private String securitycode;

    public OpenApiReadPartnerSecurityCodeDto() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getUuid() {

        return uuid;

    }

    public String getSecuritycode() {

        return securitycode;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setUuid(String uuid) {

        this.uuid = uuid;

    }

    public void setSecuritycode(String securitycode) {

        this.securitycode = securitycode;

    }
}
