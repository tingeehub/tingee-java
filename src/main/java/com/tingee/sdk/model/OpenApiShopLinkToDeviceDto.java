package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class OpenApiShopLinkToDeviceDto {
    @lombok.NonNull
    @JsonProperty("shopName")
    private String shopName;
    @lombok.NonNull
    @JsonProperty("shopId")
    private Integer shopId;
    @lombok.NonNull
    @JsonProperty("isLinkToDevice")
    private Boolean isLinkToDevice;
    @lombok.NonNull
    @JsonProperty("fullAddress")
    private String fullAddress;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;

    /** Use this constructor to set all required fields. */
    public OpenApiShopLinkToDeviceDto(String shopName, Integer shopId, Boolean isLinkToDevice, String fullAddress) {
        this.shopName = shopName;
        this.shopId = shopId;
        this.isLinkToDevice = isLinkToDevice;
        this.fullAddress = fullAddress;
    }
}
