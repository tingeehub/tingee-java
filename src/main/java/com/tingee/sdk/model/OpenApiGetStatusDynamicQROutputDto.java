package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class OpenApiGetStatusDynamicQROutputDto {
    @lombok.NonNull
    @JsonProperty("billInfo")
    private OpenApiBillInfoDto billInfo;
    @lombok.NonNull
    @JsonProperty("transactionInfos")
    private List<OpenApiTransactionPagedOuputDto> transactionInfos;

    /** Use this constructor to set all required fields. */
    public OpenApiGetStatusDynamicQROutputDto(OpenApiBillInfoDto billInfo, List<OpenApiTransactionPagedOuputDto> transactionInfos) {
        this.billInfo = billInfo;
        this.transactionInfos = transactionInfos;
    }
}
