package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiDeleteConfigDto {
    @JsonProperty("otpNumber")
    private String otpNumber;
    @JsonProperty("confirmId")
    private String confirmId;
    @lombok.NonNull
    @JsonProperty("id")
    private Double id;
    @JsonProperty("merchantId")
    private Integer merchantId;

    /** Use this constructor to set all required fields. */
    public OpenApiDeleteConfigDto(Double id) {
        this.id = id;
    }
}
