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
public class VCBBaasDto {
    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    @JsonProperty("webhookUrl")
    private String webhookUrl;

}
