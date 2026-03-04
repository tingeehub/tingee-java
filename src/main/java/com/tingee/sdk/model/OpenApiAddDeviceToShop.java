package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiAddDeviceToShop {
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("securityCode")
    private String securitycode;
    @JsonProperty("appType")
    private String apptype;
    @JsonProperty("masterMerchantId")
    private Double mastermerchantid;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("vaAccountNumbers")
    private List<String> vaaccountnumbers;
    @JsonProperty("shopIds")
    private List<Double> shopids;

    public OpenApiAddDeviceToShop() {
    }

    public String getUuid() {

        return uuid;

    }

    public String getSecuritycode() {

        return securitycode;

    }

    public String getApptype() {

        return apptype;

    }

    public Double getMastermerchantid() {

        return mastermerchantid;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public List<String> getVaaccountnumbers() {

        return vaaccountnumbers;

    }

    public List<Double> getShopids() {

        return shopids;

    }

    public void setUuid(String uuid) {

        this.uuid = uuid;

    }

    public void setSecuritycode(String securitycode) {

        this.securitycode = securitycode;

    }

    public void setApptype(String apptype) {

        this.apptype = apptype;

    }

    public void setMastermerchantid(Double mastermerchantid) {

        this.mastermerchantid = mastermerchantid;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setVaaccountnumbers(List<String> vaaccountnumbers) {

        this.vaaccountnumbers = vaaccountnumbers;

    }

    public void setShopids(List<Double> shopids) {

        this.shopids = shopids;

    }
}
