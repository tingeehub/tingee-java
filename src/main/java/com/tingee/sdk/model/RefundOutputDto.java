package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class RefundOutputDto {
    @JsonProperty("refundAmount")
    private Double refundamount;
    @JsonProperty("transactionId")
    private String transactionid;
    @JsonProperty("status")
    private String status;

    public RefundOutputDto() {
    }

    public Double getRefundamount() {

        return refundamount;

    }

    public String getTransactionid() {

        return transactionid;

    }

    public String getStatus() {

        return status;

    }

    public void setRefundamount(Double refundamount) {

        this.refundamount = refundamount;

    }

    public void setTransactionid(String transactionid) {

        this.transactionid = transactionid;

    }

    public void setStatus(String status) {

        this.status = status;

    }
}
