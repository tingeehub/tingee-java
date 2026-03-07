package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class OpenApiLinkOrUnlinkNfcShopDto {
    @lombok.NonNull
    @JsonProperty("nfcId")
    private String nfcId;
    @lombok.NonNull
    @JsonProperty("shopId")
    private Double shopId;
    @lombok.NonNull
    @JsonProperty("isLink")
    private Boolean isLink;
    @JsonProperty("merchantId")
    private Integer merchantId;

    /** Use this constructor to set all required fields. */
    public OpenApiLinkOrUnlinkNfcShopDto(String nfcId, Double shopId, Boolean isLink) {
        this.nfcId = nfcId;
        this.shopId = shopId;
        this.isLink = isLink;
    }
}
