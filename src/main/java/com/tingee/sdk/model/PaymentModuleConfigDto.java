package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class PaymentModuleConfigDto {
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("position")
    private Double position;
    @JsonProperty("accountNumberIds")
    private List<String> accountNumberIds;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;

}
