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
public class OpenApiGetShopPagedOuputDto {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;

}
