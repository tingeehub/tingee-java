package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiShopNFCConfigDto {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("shopId")
    private Double shopid;
    @JsonProperty("displayName")
    private String displayname;
    @JsonProperty("color")
    private String color;
    @JsonProperty("address")
    private String address;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("isActive")
    private Boolean isactive;
    @JsonProperty("modules")
    private ShopNfcModuleItemDto modules;

    public OpenApiShopNFCConfigDto() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public Double getShopid() {

        return shopid;

    }

    public String getDisplayname() {

        return displayname;

    }

    public String getColor() {

        return color;

    }

    public String getAddress() {

        return address;

    }

    public String getTitle() {

        return title;

    }

    public String getDescription() {

        return description;

    }

    public String getLogo() {

        return logo;

    }

    public String getAvatar() {

        return avatar;

    }

    public Boolean getIsactive() {

        return isactive;

    }

    public ShopNfcModuleItemDto getModules() {

        return modules;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setShopid(Double shopid) {

        this.shopid = shopid;

    }

    public void setDisplayname(String displayname) {

        this.displayname = displayname;

    }

    public void setColor(String color) {

        this.color = color;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public void setLogo(String logo) {

        this.logo = logo;

    }

    public void setAvatar(String avatar) {

        this.avatar = avatar;

    }

    public void setIsactive(Boolean isactive) {

        this.isactive = isactive;

    }

    public void setModules(ShopNfcModuleItemDto modules) {

        this.modules = modules;

    }
}
