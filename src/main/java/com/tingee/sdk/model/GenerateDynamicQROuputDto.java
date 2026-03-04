package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class GenerateDynamicQROuputDto {
    @JsonProperty("qrCode")
    private String qrcode;
    @JsonProperty("qrAccount")
    private String qraccount;
    @JsonProperty("billId")
    private String billid;

    public GenerateDynamicQROuputDto() {
    }

    public String getQrcode() {

        return qrcode;

    }

    public String getQraccount() {

        return qraccount;

    }

    public String getBillid() {

        return billid;

    }

    public void setQrcode(String qrcode) {

        this.qrcode = qrcode;

    }

    public void setQraccount(String qraccount) {

        this.qraccount = qraccount;

    }

    public void setBillid(String billid) {

        this.billid = billid;

    }
}
