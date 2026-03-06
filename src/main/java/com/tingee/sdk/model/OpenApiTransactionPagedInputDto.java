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
public class OpenApiTransactionPagedInputDto {
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
    @JsonProperty("shopIds")
    private List<Double> shopIds;
    @JsonProperty("vaAccountNumbers")
    private List<String> vaAccountNumbers;
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("billId")
    private String billId;
    @JsonProperty("startTime")
    private String startTime;
    @JsonProperty("endTime")
    private String endTime;

    /** Use this constructor to set all required fields. */
    public OpenApiTransactionPagedInputDto(Integer skipCount, Integer maxResultCount) {
        this.skipCount = skipCount;
        this.maxResultCount = maxResultCount;
    }
}
