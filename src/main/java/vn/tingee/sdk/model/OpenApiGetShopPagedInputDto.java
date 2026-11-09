package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiGetShopPagedInputDto {
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("sorting")
    private String sorting;
    @JsonProperty("skipCount")
    private Integer skipCount;
    @JsonProperty("maxResultCount")
    private Integer maxResultCount;
    @JsonProperty("merchantId")
    private Integer merchantId;

}
