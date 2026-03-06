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
public class OpenApiOuputDto {
    @lombok.NonNull
    @JsonProperty("code")
    private String code;
    @lombok.NonNull
    @JsonProperty("message")
    private String message;
    @lombok.NonNull
    @JsonProperty("data")
    private Object data;

    /** Use this constructor to set all required fields. */
    public OpenApiOuputDto(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
