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
public class OnePayConfigDto {
    @lombok.NonNull
    @JsonProperty("merchantId")
    private String merchantId;
    @lombok.NonNull
    @JsonProperty("signingKey")
    private String signingKey;
    @lombok.NonNull
    @JsonProperty("verifyKey")
    private String verifyKey;
    @lombok.NonNull
    @JsonProperty("accessCode")
    private String accessCode;
    @lombok.NonNull
    @JsonProperty("hashCode")
    private String hashCode;
    @lombok.NonNull
    @JsonProperty("callbackUrl")
    private String callbackUrl;

    /** Use this constructor to set all required fields. */
    public OnePayConfigDto(String merchantId, String signingKey, String verifyKey, String accessCode, String hashCode, String callbackUrl) {
        this.merchantId = merchantId;
        this.signingKey = signingKey;
        this.verifyKey = verifyKey;
        this.accessCode = accessCode;
        this.hashCode = hashCode;
        this.callbackUrl = callbackUrl;
    }
}
