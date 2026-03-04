package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiWebhookOrderInputDto {
    @JsonProperty("shopId")
    private Double shopid;

    public OpenApiWebhookOrderInputDto() {
    }

    public Double getShopid() {

        return shopid;

    }

    public void setShopid(Double shopid) {

        this.shopid = shopid;

    }
}
