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
public class VPBConfigBusinessDto {
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("accountName")
    private String accountName;
    @lombok.NonNull
    @JsonProperty("merchantId")
    private String merchantId;
    @lombok.NonNull
    @JsonProperty("terminalId")
    private String terminalId;

    /** Use this constructor to set all required fields. */
    public VPBConfigBusinessDto(String accountNumber, String accountName, String merchantId, String terminalId) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.merchantId = merchantId;
        this.terminalId = terminalId;
    }
}
