package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class GenerateVietQROuputDto {
    @JsonProperty("qrCode")
    private String qrcode;
    @JsonProperty("qrCodeImage")
    private String qrcodeimage;
    @JsonProperty("qrAccount")
    private String qraccount;
    @JsonProperty("referenceLabelCode")
    private String referencelabelcode;

    public GenerateVietQROuputDto() {
    }

    public String getQrcode() {

        return qrcode;

    }

    public String getQrcodeimage() {

        return qrcodeimage;

    }

    public String getQraccount() {

        return qraccount;

    }

    public String getReferencelabelcode() {

        return referencelabelcode;

    }

    public void setQrcode(String qrcode) {

        this.qrcode = qrcode;

    }

    public void setQrcodeimage(String qrcodeimage) {

        this.qrcodeimage = qrcodeimage;

    }

    public void setQraccount(String qraccount) {

        this.qraccount = qraccount;

    }

    public void setReferencelabelcode(String referencelabelcode) {

        this.referencelabelcode = referencelabelcode;

    }
}
