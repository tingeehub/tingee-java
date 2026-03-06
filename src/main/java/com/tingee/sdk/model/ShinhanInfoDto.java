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
public class ShinhanInfoDto {
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("merchantName")
    private String merchantName;

}
