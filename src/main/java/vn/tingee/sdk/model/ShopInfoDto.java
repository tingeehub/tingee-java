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
public class ShopInfoDto {
    @lombok.NonNull
    @JsonProperty("name")
    private String name;
    @lombok.NonNull
    @JsonProperty("id")
    private Integer id;

    /** Use this constructor to set all required fields. */
    public ShopInfoDto(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
}
