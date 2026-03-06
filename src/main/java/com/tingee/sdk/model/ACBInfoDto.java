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
public class ACBInfoDto {
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @JsonProperty("merchantName")
    private String merchantName;
    @JsonProperty("merchantAddress")
    private String merchantAddress;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("accountName")
    private String accountName;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("email")
    private String email;
    @JsonProperty("acbUserId")
    private String acbUserId;

}
