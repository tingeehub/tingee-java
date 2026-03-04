package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiBankCreateOrUpdateConfigDto {
    @JsonProperty("bidvConfigDto")
    private BIDVConfigDto bidvconfigdto;
    @JsonProperty("ctgConfigDto")
    private CTGConfigDto ctgconfigdto;
    @JsonProperty("acbConfigDto")
    private ACBConfigBusinessDto acbconfigdto;
    @JsonProperty("accountType")
    private String accounttype;
    @JsonProperty("id")
    private Double id;
    @JsonProperty("otpNumber")
    private String otpnumber;
    @JsonProperty("confirmId")
    private String confirmid;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private String bankname;
    @JsonProperty("merchantId")
    private Double merchantid;

    public OpenApiBankCreateOrUpdateConfigDto() {
    }

    public BIDVConfigDto getBidvconfigdto() {

        return bidvconfigdto;

    }

    public CTGConfigDto getCtgconfigdto() {

        return ctgconfigdto;

    }

    public ACBConfigBusinessDto getAcbconfigdto() {

        return acbconfigdto;

    }

    public String getAccounttype() {

        return accounttype;

    }

    public Double getId() {

        return id;

    }

    public String getOtpnumber() {

        return otpnumber;

    }

    public String getConfirmid() {

        return confirmid;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getBankname() {

        return bankname;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public void setBidvconfigdto(BIDVConfigDto bidvconfigdto) {

        this.bidvconfigdto = bidvconfigdto;

    }

    public void setCtgconfigdto(CTGConfigDto ctgconfigdto) {

        this.ctgconfigdto = ctgconfigdto;

    }

    public void setAcbconfigdto(ACBConfigBusinessDto acbconfigdto) {

        this.acbconfigdto = acbconfigdto;

    }

    public void setAccounttype(String accounttype) {

        this.accounttype = accounttype;

    }

    public void setId(Double id) {

        this.id = id;

    }

    public void setOtpnumber(String otpnumber) {

        this.otpnumber = otpnumber;

    }

    public void setConfirmid(String confirmid) {

        this.confirmid = confirmid;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }
}
