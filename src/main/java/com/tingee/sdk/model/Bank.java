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
public class Bank {
    @JsonProperty("code")
    private BankNameEnum code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("bin")
    private String bin;
    @JsonProperty("urlLogo")
    private String urlLogo;
    @JsonProperty("termsAndConditions")
    private Object termsAndConditions;

}
