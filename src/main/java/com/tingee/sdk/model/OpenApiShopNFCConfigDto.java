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
public class OpenApiShopNFCConfigDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("shopId")
    private Double shopId;
    @lombok.NonNull
    @JsonProperty("displayName")
    private String displayName;
    @lombok.NonNull
    @JsonProperty("color")
    private String color;
    @lombok.NonNull
    @JsonProperty("address")
    private String address;
    @lombok.NonNull
    @JsonProperty("title")
    private String title;
    @lombok.NonNull
    @JsonProperty("description")
    private String description;
    @lombok.NonNull
    @JsonProperty("logo")
    private String logo;
    @lombok.NonNull
    @JsonProperty("avatar")
    private String avatar;
    @lombok.NonNull
    @JsonProperty("isActive")
    private Boolean isActive;
    @lombok.NonNull
    @JsonProperty("modules")
    private ShopNfcModuleItemDto modules;

    /** Use this constructor to set all required fields. */
    public OpenApiShopNFCConfigDto(Double shopId, String displayName, String color, String address, String title, String description, String logo, String avatar, Boolean isActive, ShopNfcModuleItemDto modules) {
        this.shopId = shopId;
        this.displayName = displayName;
        this.color = color;
        this.address = address;
        this.title = title;
        this.description = description;
        this.logo = logo;
        this.avatar = avatar;
        this.isActive = isActive;
        this.modules = modules;
    }
}
