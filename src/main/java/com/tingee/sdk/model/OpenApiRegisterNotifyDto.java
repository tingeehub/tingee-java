package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiRegisterNotifyDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;

    /** Use this constructor to set all required fields. */
    public OpenApiRegisterNotifyDto(String vaAccountNumber) {
        this.vaAccountNumber = vaAccountNumber;
    }
}
