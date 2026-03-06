package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiGetStatusDynamicQRInputDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("qrAccount")
    private String qrAccount;
    @lombok.NonNull
    @JsonProperty("billId")
    private String billId;

    /** Use this constructor to set all required fields. */
    public OpenApiGetStatusDynamicQRInputDto(String qrAccount, String billId) {
        this.qrAccount = qrAccount;
        this.billId = billId;
    }
}
