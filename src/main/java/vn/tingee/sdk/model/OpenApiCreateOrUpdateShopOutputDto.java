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
public class OpenApiCreateOrUpdateShopOutputDto {
    @lombok.NonNull
    @JsonProperty("shopId")
    private Integer shopId;

    /** Use this constructor to set all required fields. */
    public OpenApiCreateOrUpdateShopOutputDto(Integer shopId) {
        this.shopId = shopId;
    }
}
