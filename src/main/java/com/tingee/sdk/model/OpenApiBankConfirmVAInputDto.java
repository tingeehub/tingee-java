package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiBankConfirmVAInputDto {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("confirmId")
    private String confirmid;
    @JsonProperty("otpNumber")
    private String otpnumber;
    @JsonProperty("bankName")
    private BankNameEnum bankname;
    @JsonProperty("bankBin")
    private String bankbin;

    public OpenApiBankConfirmVAInputDto() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getConfirmid() {

        return confirmid;

    }

    public String getOtpnumber() {

        return otpnumber;

    }

    public BankNameEnum getBankname() {

        return bankname;

    }

    public String getBankbin() {

        return bankbin;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setConfirmid(String confirmid) {

        this.confirmid = confirmid;

    }

    public void setOtpnumber(String otpnumber) {

        this.otpnumber = otpnumber;

    }

    public void setBankname(BankNameEnum bankname) {

        this.bankname = bankname;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }
}
