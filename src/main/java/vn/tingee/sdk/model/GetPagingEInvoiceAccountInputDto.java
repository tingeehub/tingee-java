package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class GetPagingEInvoiceAccountInputDto {
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("sorting")
    private String sorting;
    @JsonProperty("skipCount")
    private Integer skipCount;
    @JsonProperty("maxResultCount")
    private Integer maxResultCount;
    @JsonProperty("provider")
    private EInvoiceProviderEnum provider;
    @JsonProperty("isDefault")
    private Boolean isDefault;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("masterMerchantId")
    private Integer masterMerchantId;

}
