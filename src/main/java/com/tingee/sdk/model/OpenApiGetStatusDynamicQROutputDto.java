package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiGetStatusDynamicQROutputDto {
    @JsonProperty("billInfo")
    private OpenApiBillInfoDto billinfo;
    @JsonProperty("transactionInfos")
    private List<OpenApiTransactionPagedOuputDto> transactioninfos;

    public OpenApiGetStatusDynamicQROutputDto() {
    }

    public OpenApiBillInfoDto getBillinfo() {

        return billinfo;

    }

    public List<OpenApiTransactionPagedOuputDto> getTransactioninfos() {

        return transactioninfos;

    }

    public void setBillinfo(OpenApiBillInfoDto billinfo) {

        this.billinfo = billinfo;

    }

    public void setTransactioninfos(List<OpenApiTransactionPagedOuputDto> transactioninfos) {

        this.transactioninfos = transactioninfos;

    }
}
