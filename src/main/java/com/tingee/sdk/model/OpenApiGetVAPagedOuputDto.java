package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiGetVAPagedOuputDto {
    @JsonProperty("bankName")
    private BankNameEnum bankname;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("accountType")
    private BankAccountTypeEnum accounttype;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;
    @JsonProperty("shopId")
    private Double shopid;
    @JsonProperty("status")
    private StatusMerchantAccountNumberEnum status;
    @JsonProperty("creationTime")
    private LocalDateTime creationtime;

    public OpenApiGetVAPagedOuputDto() {
    }

    public BankNameEnum getBankname() {

        return bankname;

    }

    public String getBankbin() {

        return bankbin;

    }

    public BankAccountTypeEnum getAccounttype() {

        return accounttype;

    }

    public String getAccountname() {

        return accountname;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public Double getShopid() {

        return shopid;

    }

    public StatusMerchantAccountNumberEnum getStatus() {

        return status;

    }

    public LocalDateTime getCreationtime() {

        return creationtime;

    }

    public void setBankname(BankNameEnum bankname) {

        this.bankname = bankname;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setAccounttype(BankAccountTypeEnum accounttype) {

        this.accounttype = accounttype;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }

    public void setShopid(Double shopid) {

        this.shopid = shopid;

    }

    public void setStatus(StatusMerchantAccountNumberEnum status) {

        this.status = status;

    }

    public void setCreationtime(LocalDateTime creationtime) {

        this.creationtime = creationtime;

    }
}
