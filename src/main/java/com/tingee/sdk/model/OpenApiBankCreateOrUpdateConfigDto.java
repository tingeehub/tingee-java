package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiBankCreateOrUpdateConfigDto {
    @JsonProperty("bidvConfigDto")
    private BIDVConfigDto bidvconfigdto;
    @JsonProperty("vibConfigDto")
    private VIBConfigDto vibconfigdto;
    @JsonProperty("ctgConfigDto")
    private CTGConfigDto ctgconfigdto;
    @JsonProperty("acbConfigDto")
    private ACBConfigBusinessDto acbconfigdto;
    @JsonProperty("vcbConfigDto")
    private VCBConfigBusinessDto vcbconfigdto;
    @JsonProperty("msbConfigDto")
    private MSBConfigBusinessDto msbconfigdto;
    @JsonProperty("accountType")
    private BankAccountTypeEnum accounttype;
    @JsonProperty("id")
    private Double id;
    @JsonProperty("otpNumber")
    private String otpnumber;
    @JsonProperty("confirmId")
    private String confirmid;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private BankNameEnum bankname;
    @JsonProperty("merchantId")
    private Double merchantid;

    public OpenApiBankCreateOrUpdateConfigDto() {
    }

    public BIDVConfigDto getBidvconfigdto() {

        return bidvconfigdto;

    }

    public VIBConfigDto getVibconfigdto() {

        return vibconfigdto;

    }

    public CTGConfigDto getCtgconfigdto() {

        return ctgconfigdto;

    }

    public ACBConfigBusinessDto getAcbconfigdto() {

        return acbconfigdto;

    }

    public VCBConfigBusinessDto getVcbconfigdto() {

        return vcbconfigdto;

    }

    public MSBConfigBusinessDto getMsbconfigdto() {

        return msbconfigdto;

    }

    public BankAccountTypeEnum getAccounttype() {

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

    public BankNameEnum getBankname() {

        return bankname;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public void setBidvconfigdto(BIDVConfigDto bidvconfigdto) {

        this.bidvconfigdto = bidvconfigdto;

    }

    public void setVibconfigdto(VIBConfigDto vibconfigdto) {

        this.vibconfigdto = vibconfigdto;

    }

    public void setCtgconfigdto(CTGConfigDto ctgconfigdto) {

        this.ctgconfigdto = ctgconfigdto;

    }

    public void setAcbconfigdto(ACBConfigBusinessDto acbconfigdto) {

        this.acbconfigdto = acbconfigdto;

    }

    public void setVcbconfigdto(VCBConfigBusinessDto vcbconfigdto) {

        this.vcbconfigdto = vcbconfigdto;

    }

    public void setMsbconfigdto(MSBConfigBusinessDto msbconfigdto) {

        this.msbconfigdto = msbconfigdto;

    }

    public void setAccounttype(BankAccountTypeEnum accounttype) {

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

    public void setBankname(BankNameEnum bankname) {

        this.bankname = bankname;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }
}
