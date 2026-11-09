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
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("accountName")
    private String accountName;
    @JsonProperty("identity")
    private String identity;
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
    @JsonProperty("appType")
    private AppTypeEnum appType;
    @JsonProperty("linkType")
    private LinkTypeEnum linkType;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("acbUserId")
    private String acbUserId;
    @JsonProperty("minAmount")
    private Double minAmount;
    @JsonProperty("maxAmount")
    private Double maxAmount;
    @JsonProperty("isAbleOnOffByBill")
    private Boolean isAbleOnOffByBill;
    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("transactionType")
    private TransactionTypeEnum transactionType;
    @JsonProperty("walletId")
    private String walletId;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    @JsonProperty("webhookUrl")
    private String webhookUrl;

}
