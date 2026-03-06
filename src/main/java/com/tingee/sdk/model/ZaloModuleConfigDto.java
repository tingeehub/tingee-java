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
public class ZaloModuleConfigDto {
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("position")
    private Double position;
    @JsonProperty("zaloId")
    private String zaloId;
    @JsonProperty("title")
    private String title;

}
