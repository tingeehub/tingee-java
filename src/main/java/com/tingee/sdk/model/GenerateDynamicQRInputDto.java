package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class GenerateDynamicQRInputDto {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;
    @JsonProperty("qrCodeType")
    private String qrcodetype;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private String bankname;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("extraInfo")
    private String extrainfo;

    public GenerateDynamicQRInputDto() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public String getQrcodetype() {

        return qrcodetype;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getBankname() {

        return bankname;

    }

    public Double getAmount() {

        return amount;

    }

    public String getPurpose() {

        return purpose;

    }

    public String getExtrainfo() {

        return extrainfo;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }

    public void setQrcodetype(String qrcodetype) {

        this.qrcodetype = qrcodetype;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }

    public void setAmount(Double amount) {

        this.amount = amount;

    }

    public void setPurpose(String purpose) {

        this.purpose = purpose;

    }

    public void setExtrainfo(String extrainfo) {

        this.extrainfo = extrainfo;

    }
}
