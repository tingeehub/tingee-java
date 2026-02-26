package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiDeleteConfigDto {
    @JsonProperty("otpNumber")
    private String otpnumber;
    @JsonProperty("confirmId")
    private String confirmid;
    @JsonProperty("id")
    private Double id;
    @JsonProperty("merchantId")
    private Double merchantid;

    public OpenApiDeleteConfigDto() {
    }

    public String getOtpnumber() {

        return otpnumber;

    }

    public String getConfirmid() {

        return confirmid;

    }

    public Double getId() {

        return id;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public void setOtpnumber(String otpnumber) {

        this.otpnumber = otpnumber;

    }

    public void setConfirmid(String confirmid) {

        this.confirmid = confirmid;

    }

    public void setId(Double id) {

        this.id = id;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }
}
