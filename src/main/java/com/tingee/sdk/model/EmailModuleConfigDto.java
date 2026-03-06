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
public class EmailModuleConfigDto {
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("position")
    private Double position;
    @JsonProperty("email")
    private String email;
    @JsonProperty("title")
    private String title;

}
