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
public class DeleteSubscriptionOutputDto {
    @JsonProperty("confirmUrl")
    private String confirmUrl;
    @lombok.NonNull
    @JsonProperty("code")
    private String code;

    /** Use this constructor to set all required fields. */
    public DeleteSubscriptionOutputDto(String code) {
        this.code = code;
    }
}
