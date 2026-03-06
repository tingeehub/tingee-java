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
public class BIDVConfigDto {
    @lombok.NonNull
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @lombok.NonNull
    @JsonProperty("bankPartnerId")
    private String bankPartnerId;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("accountName")
    private String accountName;

    /** Use this constructor to set all required fields. */
    public BIDVConfigDto(String vaPrefix, String bankPartnerId, String accountNumber, String accountName) {
        this.vaPrefix = vaPrefix;
        this.bankPartnerId = bankPartnerId;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }
}
