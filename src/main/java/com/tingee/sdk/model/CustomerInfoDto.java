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
public class CustomerInfoDto {
    @lombok.NonNull
    @JsonProperty("onepayAccountId")
    private String onepayAccountId;
    @lombok.NonNull
    @JsonProperty("name")
    private String name;
    @lombok.NonNull
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("email")
    private String email;

    /** Use this constructor to set all required fields. */
    public CustomerInfoDto(String onepayAccountId, String name, String phone) {
        this.onepayAccountId = onepayAccountId;
        this.name = name;
        this.phone = phone;
    }
}
