package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiUpdateShopDeviceLinkDto {
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("type")
    private DeviceTypeEnum type;
    @JsonProperty("appType")
    private AppTypeEnum apptype;
    @JsonProperty("shopsLinkToDeviceDtos")
    private List<OpenApiShopLinkToDeviceDto> shopslinktodevicedtos;
    @JsonProperty("merchantId")
    private Double merchantid;

    public OpenApiUpdateShopDeviceLinkDto() {
    }

    public String getUuid() {

        return uuid;

    }

    public DeviceTypeEnum getType() {

        return type;

    }

    public AppTypeEnum getApptype() {

        return apptype;

    }

    public List<OpenApiShopLinkToDeviceDto> getShopslinktodevicedtos() {

        return shopslinktodevicedtos;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public void setUuid(String uuid) {

        this.uuid = uuid;

    }

    public void setType(DeviceTypeEnum type) {

        this.type = type;

    }

    public void setApptype(AppTypeEnum apptype) {

        this.apptype = apptype;

    }

    public void setShopslinktodevicedtos(List<OpenApiShopLinkToDeviceDto> shopslinktodevicedtos) {

        this.shopslinktodevicedtos = shopslinktodevicedtos;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }
}
