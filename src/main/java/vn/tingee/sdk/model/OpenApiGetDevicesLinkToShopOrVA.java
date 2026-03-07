package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiGetDevicesLinkToShopOrVA {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("shopId")
    private Integer shopId;

}
