package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiGetVAPagedInputDto {
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("sorting")
    private String sorting;
    @JsonProperty("skipCount")
    private Integer skipCount;
    @JsonProperty("maxResultCount")
    private Integer maxResultCount;
    @JsonProperty("startTime")
    private LocalDateTime startTime;
    @JsonProperty("endTime")
    private LocalDateTime endTime;
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("shopId")
    private Integer shopId;
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @JsonProperty("status")
    private StatusMerchantAccountNumberEnum status;
    @JsonProperty("agentId")
    private Integer agentId;
    @JsonProperty("dataAccess")
    private DataAccessFilterEnum dataAccess;
    @JsonProperty("transactionType")
    private TransactionTypeEnum transactionType;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;

}
