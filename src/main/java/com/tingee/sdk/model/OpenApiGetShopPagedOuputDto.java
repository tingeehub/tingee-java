package com.tingee.sdk.model;

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
    @lombok.NonNull
    @JsonProperty("id")
    private Integer id;
    @lombok.NonNull
    @JsonProperty("isActive")
    private Boolean isActive;
    @lombok.NonNull
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;

    /** Use this constructor to set all required fields. */
    public OpenApiGetShopPagedOuputDto(Integer id, Boolean isActive, String name) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
    }
}
