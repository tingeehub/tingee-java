package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiLinkOrUnlinkNfcShopDto {
    @JsonProperty("nfcId")
    private String nfcid;
    @JsonProperty("shopId")
    private Double shopid;
    @JsonProperty("isLink")
    private Boolean islink;
    @JsonProperty("merchantId")
    private Double merchantid;

    public OpenApiLinkOrUnlinkNfcShopDto() {
    }

    public String getNfcid() {

        return nfcid;

    }

    public Double getShopid() {

        return shopid;

    }

    public Boolean getIslink() {

        return islink;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public void setNfcid(String nfcid) {

        this.nfcid = nfcid;

    }

    public void setShopid(Double shopid) {

        this.shopid = shopid;

    }

    public void setIslink(Boolean islink) {

        this.islink = islink;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }
}
