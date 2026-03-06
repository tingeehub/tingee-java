package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class MerchantPackageInfo {
    @JsonProperty("packageName")
    private String packageName;
    @JsonProperty("expirationDate")
    private LocalDateTime expirationDate;

}
