package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiShowQRCodeDto {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("qrCode")
    private String qrcode;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private BankNameEnum bankname;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("deviceType")
    private DeviceTypeEnum devicetype;
    @JsonProperty("firstText")
    private String firsttext;
    @JsonProperty("secondText")
    private String secondtext;
    @JsonProperty("thirdText")
    private String thirdtext;
    @JsonProperty("showTime")
    private Double showtime;
    @JsonProperty("isStaticQr")
    private Boolean isstaticqr;
    @JsonProperty("playSound")
    private Boolean playsound;

    public OpenApiShowQRCodeDto() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public Double getAmount() {

        return amount;

    }

    public String getQrcode() {

        return qrcode;

    }

    public String getBankbin() {

        return bankbin;

    }

    public BankNameEnum getBankname() {

        return bankname;

    }

    public String getUuid() {

        return uuid;

    }

    public DeviceTypeEnum getDevicetype() {

        return devicetype;

    }

    public String getFirsttext() {

        return firsttext;

    }

    public String getSecondtext() {

        return secondtext;

    }

    public String getThirdtext() {

        return thirdtext;

    }

    public Double getShowtime() {

        return showtime;

    }

    public Boolean getIsstaticqr() {

        return isstaticqr;

    }

    public Boolean getPlaysound() {

        return playsound;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }

    public void setAmount(Double amount) {

        this.amount = amount;

    }

    public void setQrcode(String qrcode) {

        this.qrcode = qrcode;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(BankNameEnum bankname) {

        this.bankname = bankname;

    }

    public void setUuid(String uuid) {

        this.uuid = uuid;

    }

    public void setDevicetype(DeviceTypeEnum devicetype) {

        this.devicetype = devicetype;

    }

    public void setFirsttext(String firsttext) {

        this.firsttext = firsttext;

    }

    public void setSecondtext(String secondtext) {

        this.secondtext = secondtext;

    }

    public void setThirdtext(String thirdtext) {

        this.thirdtext = thirdtext;

    }

    public void setShowtime(Double showtime) {

        this.showtime = showtime;

    }

    public void setIsstaticqr(Boolean isstaticqr) {

        this.isstaticqr = isstaticqr;

    }

    public void setPlaysound(Boolean playsound) {

        this.playsound = playsound;

    }
}
