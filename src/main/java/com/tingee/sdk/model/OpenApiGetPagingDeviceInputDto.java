package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiGetPagingDeviceInputDto {
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
    @lombok.NonNull
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("type")
    private DeviceTypeEnum type;

    /** Use this constructor to set all required fields. */
    public OpenApiGetPagingDeviceInputDto(Integer skipCount, Integer maxResultCount, Integer merchantId) {
        this.skipCount = skipCount;
        this.maxResultCount = maxResultCount;
        this.merchantId = merchantId;
    }
}
