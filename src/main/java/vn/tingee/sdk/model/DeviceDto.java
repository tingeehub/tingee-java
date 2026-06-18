package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeviceDto {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("creationTime")
    private LocalDateTime creationTime;
    @JsonProperty("creatorUserId")
    private Double creatorUserId;
    @JsonProperty("lastModificationTime")
    private LocalDateTime lastModificationTime;
    @JsonProperty("lastModifierUserId")
    private Double lastModifierUserId;
    @JsonProperty("deleterUserId")
    private Double deleterUserId;
    @lombok.NonNull
    @JsonProperty("type")
    private DeviceTypeEnum type;
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;
    @lombok.NonNull
    @JsonProperty("name")
    private String name;
    @JsonProperty("system")
    private String system;
    @JsonProperty("systemVersion")
    private String systemVersion;
    @JsonProperty("merchantId")
    private Double merchantId;
    @JsonProperty("assignedAgentId")
    private Double assignedAgentId;
    @JsonProperty("merchantPhoneNumber")
    private String merchantPhoneNumber;
    @JsonProperty("employeeName")
    private String employeeName;
    @JsonProperty("firebaseToken")
    private String firebaseToken;
    @lombok.NonNull
    @JsonProperty("status")
    private DeviceStatusEnum status;
    @JsonProperty("deviceInfoDto")
    private DeviceInfoDto deviceInfoDto;
    @JsonProperty("useDate")
    private LocalDateTime useDate;
    @JsonProperty("securityCode")
    private String securityCode;
    @JsonProperty("selectedBankNames")
    private List<BankNameEnum> selectedBankNames;
    @JsonProperty("serialNumber")
    private String serialNumber;
    @JsonProperty("userReferralAncestorIds")
    private String userReferralAncestorIds;
    @JsonProperty("userReferralLevel")
    private Double userReferralLevel;
    @JsonProperty("deviceDistributorAncestorIds")
    private String deviceDistributorAncestorIds;
    @JsonProperty("deviceDistributorLevel")
    private Double deviceDistributorLevel;
    @lombok.NonNull
    @JsonProperty("masterMerchantId")
    private Double masterMerchantId;
    @JsonProperty("expirationDate")
    private LocalDateTime expirationDate;
    @JsonProperty("merchantName")
    private String merchantName;
    @JsonProperty("shopDtos")
    private List<ShopInfoDto> shopDtos;
    @JsonProperty("agentName")
    private String agentName;
    @JsonProperty("agentId")
    private Integer agentId;
    @JsonProperty("simPhoneNumber")
    private String simPhoneNumber;
    @JsonProperty("simSerialNumber")
    private String simSerialNumber;
    @JsonProperty("simProvider")
    private String simProvider;
    @JsonProperty("simPlan")
    private String simPlan;
    @JsonProperty("simExpirationDate")
    private LocalDateTime simExpirationDate;
    @JsonProperty("simActivationDate")
    private LocalDateTime simActivationDate;

    /** Use this constructor to set all required fields. */
    public DeviceDto(DeviceTypeEnum type, String uuid, String name, DeviceStatusEnum status, Double masterMerchantId) {
        this.type = type;
        this.uuid = uuid;
        this.name = name;
        this.status = status;
        this.masterMerchantId = masterMerchantId;
    }
}
