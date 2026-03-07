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
    @lombok.NonNull
    @JsonProperty("skipCount")
    private Integer skipCount;
    @lombok.NonNull
    @JsonProperty("maxResultCount")
    private Integer maxResultCount;
    @JsonProperty("startTime")
    private LocalDateTime startTime;
    @JsonProperty("endTime")
    private LocalDateTime endTime;
    @lombok.NonNull
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("shopId")
    private Integer shopId;
    @lombok.NonNull
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @JsonProperty("agentId")
    private Integer agentId;
    @lombok.NonNull
    @JsonProperty("dataAccess")
    private DataAccessFilterEnum dataAccess;
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;

    /** Use this constructor to set all required fields. */
    public OpenApiGetVAPagedInputDto(Integer skipCount, Integer maxResultCount, Integer merchantId, BankAccountTypeEnum accountType, DataAccessFilterEnum dataAccess) {
        this.skipCount = skipCount;
        this.maxResultCount = maxResultCount;
        this.merchantId = merchantId;
        this.accountType = accountType;
        this.dataAccess = dataAccess;
    }
}
