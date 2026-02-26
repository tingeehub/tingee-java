package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiShopLinkToDeviceDto {
    @JsonProperty("shopName")
    private String shopname;
    @JsonProperty("shopId")
    private Double shopid;
    @JsonProperty("isLinkToDevice")
    private Boolean islinktodevice;
    @JsonProperty("fullAddress")
    private String fulladdress;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;

    public OpenApiShopLinkToDeviceDto() {
    }

    public String getShopname() {

        return shopname;

    }

    public Double getShopid() {

        return shopid;

    }

    public Boolean getIslinktodevice() {

        return islinktodevice;

    }

    public String getFulladdress() {

        return fulladdress;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public void setShopname(String shopname) {

        this.shopname = shopname;

    }

    public void setShopid(Double shopid) {

        this.shopid = shopid;

    }

    public void setIslinktodevice(Boolean islinktodevice) {

        this.islinktodevice = islinktodevice;

    }

    public void setFulladdress(String fulladdress) {

        this.fulladdress = fulladdress;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }
}
