package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiCreateVAInpuDto {
    @JsonProperty("name")
    private String name;
    @JsonProperty("cashFlowSource")
    private CashFlowSourceEnum cashFlowSource;
    @lombok.NonNull
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("accountName")
    private String accountName;
    @lombok.NonNull
    @JsonProperty("identity")
    private String identity;
    @lombok.NonNull
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("masterMerchantId")
    private Integer masterMerchantId;
    @JsonProperty("shopId")
    private Integer shopId;
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @JsonProperty("vaSuffix")
    private String vaSuffix;
    @JsonProperty("merchantName")
    private String merchantName;
    @JsonProperty("merchantAddress")
    private String merchantAddress;
    @JsonProperty("serviceId")
    private Integer serviceId;
    @JsonProperty("isCreateNonOtp")
    private Boolean isCreateNonOtp;
    @JsonProperty("code")
    private String code;
    @JsonProperty("taxCode")
    private String taxCode;
    @JsonProperty("softposUserName")
    private String softposUserName;
    @JsonProperty("softposDeveloperId")
    private String softposDeveloperId;
    @JsonProperty("softposTid")
    private String softposTid;
    @JsonProperty("softposMid")
    private String softposMid;
    @JsonProperty("authorizationCode")
    private String authorizationCode;
    @JsonProperty("sessionLogin")
    private String sessionLogin;
    @JsonProperty("isNotifyAccountNumber")
    private Boolean isNotifyAccountNumber;
    @lombok.NonNull
    @JsonProperty("appType")
    private AppTypeEnum appType;
    @JsonProperty("linkType")
    private LinkTypeEnum linkType;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("acbUserId")
    private String acbUserId;
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    @lombok.NonNull
    @JsonProperty("webhookUrl")
    private String webhookUrl;

    /** Use this constructor to set all required fields. */
    public OpenApiCreateVAInpuDto(BankAccountTypeEnum accountType, String accountNumber, String accountName, String identity, String mobile, AppTypeEnum appType, String redirectUrl, String webhookUrl) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.identity = identity;
        this.mobile = mobile;
        this.appType = appType;
        this.redirectUrl = redirectUrl;
        this.webhookUrl = webhookUrl;
    }
}
