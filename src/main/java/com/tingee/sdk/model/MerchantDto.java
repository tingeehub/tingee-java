package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class MerchantDto {
    @lombok.NonNull
    @JsonProperty("id")
    private Integer id;
    @lombok.NonNull
    @JsonProperty("creationTime")
    private LocalDateTime creationTime;
    @JsonProperty("creatorUserId")
    private Double creatorUserId;
    @lombok.NonNull
    @JsonProperty("lastModificationTime")
    private LocalDateTime lastModificationTime;
    @JsonProperty("lastModifierUserId")
    private Double lastModifierUserId;
    @JsonProperty("deleterUserId")
    private Double deleterUserId;
    @JsonProperty("code")
    private String code;
    @lombok.NonNull
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @lombok.NonNull
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("website")
    private String website;
    @JsonProperty("businessSectorIds")
    private List<Double> businessSectorIds;
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
    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("secretToken")
    private String secretToken;
    @JsonProperty("eventUrl")
    private String eventUrl;
    @JsonProperty("eventUrls")
    private List<EventUrlItemDto> eventUrls;
    @JsonProperty("isLockEvent")
    private Boolean isLockEvent;
    @JsonProperty("bankConfigDto")
    private BankConfigDto bankConfigDto;
    @JsonProperty("bnplConfigDto")
    private BNPLConfigDto bnplConfigDto;
    @JsonProperty("directDebitConfigDto")
    private DirectDebitConfigDto directDebitConfigDto;
    @JsonProperty("sendNotifyPlatformDto")
    private SendNotifyPlatformDto sendNotifyPlatformDto;
    @JsonProperty("isOrganizationUnit")
    private Boolean isOrganizationUnit;
    @JsonProperty("referralCode")
    private String referralCode;
    @JsonProperty("userReferralAncestorIds")
    private String userReferralAncestorIds;
    @JsonProperty("userReferralLevel")
    private Double userReferralLevel;
    @JsonProperty("deviceDistributorAncestorMap")
    private String deviceDistributorAncestorMap;
    @JsonProperty("isMasterMerchant")
    private Boolean isMasterMerchant;
    @JsonProperty("merchantPackages")
    private List<MerchantPackageInfo> merchantPackages;
    @JsonProperty("masterMerchantNames")
    private String masterMerchantNames;

    /** Use this constructor to set all required fields. */
    public MerchantDto(Integer id, LocalDateTime creationTime, LocalDateTime lastModificationTime, String name, String phoneNumber) {
        this.id = id;
        this.creationTime = creationTime;
        this.lastModificationTime = lastModificationTime;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
