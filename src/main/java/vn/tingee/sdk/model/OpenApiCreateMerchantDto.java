package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiCreateMerchantDto {
    @JsonProperty("id")
    private Integer id;
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
    @JsonProperty("eventUrl")
    private String eventUrl;
    @JsonProperty("eventUrls")
    private List<EventUrlItemDto> eventUrls;
    @JsonProperty("isLockEvent")
    private Boolean isLockEvent;
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
    @lombok.NonNull
    @JsonProperty("password")
    private String password;
    @lombok.NonNull
    @JsonProperty("appType")
    private AppTypeEnum appType;
    @JsonProperty("isMultipleRole")
    private Boolean isMultipleRole;
    @JsonProperty("userReferrerId")
    private Double userReferrerId;

    /** Use this constructor to set all required fields. */
    public OpenApiCreateMerchantDto(String name, String phoneNumber, String password, AppTypeEnum appType) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.appType = appType;
    }
}
