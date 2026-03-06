package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiUpdateShopDeviceLinkDto {
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;
    @lombok.NonNull
    @JsonProperty("type")
    private DeviceTypeEnum type;
    @lombok.NonNull
    @JsonProperty("appType")
    private AppTypeEnum appType;
    @lombok.NonNull
    @JsonProperty("shopsLinkToDeviceDtos")
    private List<OpenApiShopLinkToDeviceDto> shopsLinkToDeviceDtos;
    @JsonProperty("merchantId")
    private Integer merchantId;

    /** Use this constructor to set all required fields. */
    public OpenApiUpdateShopDeviceLinkDto(String uuid, DeviceTypeEnum type, AppTypeEnum appType, List<OpenApiShopLinkToDeviceDto> shopsLinkToDeviceDtos) {
        this.uuid = uuid;
        this.type = type;
        this.appType = appType;
        this.shopsLinkToDeviceDtos = shopsLinkToDeviceDtos;
    }
}
