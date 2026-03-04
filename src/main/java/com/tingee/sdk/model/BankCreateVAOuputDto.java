package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class BankCreateVAOuputDto {
    @JsonProperty("bankName")
    private String bankname;
    @JsonProperty("merchantAccountNumberId")
    private Double merchantaccountnumberid;
    @JsonProperty("shopId")
    private Double shopid;
    @JsonProperty("status")
    private String status;
    @JsonProperty("confirmId")
    private String confirmid;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;
    @JsonProperty("deepLink")
    private String deeplink;
    @JsonProperty("otpMethod")
    private String otpmethod;

    public BankCreateVAOuputDto() {
    }

    public String getBankname() {

        return bankname;

    }

    public Double getMerchantaccountnumberid() {

        return merchantaccountnumberid;

    }

    public Double getShopid() {

        return shopid;

    }

    public String getStatus() {

        return status;

    }

    public String getConfirmid() {

        return confirmid;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public String getDeeplink() {

        return deeplink;

    }

    public String getOtpmethod() {

        return otpmethod;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }

    public void setMerchantaccountnumberid(Double merchantaccountnumberid) {

        this.merchantaccountnumberid = merchantaccountnumberid;

    }

    public void setShopid(Double shopid) {

        this.shopid = shopid;

    }

    public void setStatus(String status) {

        this.status = status;

    }

    public void setConfirmid(String confirmid) {

        this.confirmid = confirmid;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }

    public void setDeeplink(String deeplink) {

        this.deeplink = deeplink;

    }

    public void setOtpmethod(String otpmethod) {

        this.otpmethod = otpmethod;

    }
}
