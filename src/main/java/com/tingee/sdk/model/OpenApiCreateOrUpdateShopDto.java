package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiCreateOrUpdateShopDto {
    @JsonProperty("id")
    private Integer id;
    @lombok.NonNull
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @lombok.NonNull
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("provinceId")
    private String provinceId;
    @JsonProperty("districtId")
    private String districtId;
    @JsonProperty("communeId")
    private String communeId;
    @JsonProperty("address")
    private String address;
    @JsonProperty("fullAddress")
    private String fullAddress;
    @JsonProperty("sendNotifyPlatformDto")
    private SendNotifyPlatformDto sendNotifyPlatformDto;
    @lombok.NonNull
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("status")
    private String status;
    @JsonProperty("userReferralAncestorIds")
    private String userReferralAncestorIds;
    @JsonProperty("userReferralLevel")
    private Integer userReferralLevel;
    @JsonProperty("deviceDistributorAncestorMap")
    private String deviceDistributorAncestorMap;
    @JsonProperty("merchantId")
    private Integer merchantId;

    /** Use this constructor to set all required fields. */
    public OpenApiCreateOrUpdateShopDto(String name, String phoneNumber, Boolean isActive) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
    }
}
