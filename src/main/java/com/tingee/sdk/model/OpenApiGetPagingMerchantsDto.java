package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiGetPagingMerchantsDto {
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

    /** Use this constructor to set all required fields. */
    public OpenApiGetPagingMerchantsDto(Integer skipCount, Integer maxResultCount) {
        this.skipCount = skipCount;
        this.maxResultCount = maxResultCount;
    }
}
