package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiAccountNumberDDLPagedInputDto {
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
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("merchantAccountNumberIds")
    private List<Integer> merchantAccountNumberIds;
    @JsonProperty("shopIds")
    private List<Integer> shopIds;
    @JsonProperty("realVANumbers")
    private List<String> realVANumbers;
    @JsonProperty("isGetMerchantCashAccountsNumber")
    private Boolean isGetMerchantCashAccountsNumber;
    @JsonProperty("bankBins")
    private List<String> bankBins;
    @JsonProperty("bankNames")
    private List<BankNameEnum> bankNames;

    /** Use this constructor to set all required fields. */
    public OpenApiAccountNumberDDLPagedInputDto(Integer skipCount, Integer maxResultCount) {
        this.skipCount = skipCount;
        this.maxResultCount = maxResultCount;
    }
}
