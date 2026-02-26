package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiGetDevicesLinkToShopOrVA {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;
    @JsonProperty("shopId")
    private Double shopid;

    public OpenApiGetDevicesLinkToShopOrVA() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public Double getShopid() {

        return shopid;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }

    public void setShopid(Double shopid) {

        this.shopid = shopid;

    }
}
