package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiGetStatusDynamicQRInputDto {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("qrAccount")
    private String qraccount;
    @JsonProperty("billId")
    private String billid;

    public OpenApiGetStatusDynamicQRInputDto() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getQraccount() {

        return qraccount;

    }

    public String getBillid() {

        return billid;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setQraccount(String qraccount) {

        this.qraccount = qraccount;

    }

    public void setBillid(String billid) {

        this.billid = billid;

    }
}
