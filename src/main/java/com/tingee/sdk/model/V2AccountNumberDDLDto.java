package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class V2AccountNumberDDLDto {
    @JsonProperty("id")
    private Double id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private String bankname;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;
    @JsonProperty("realVANumber")
    private String realvanumber;
    @JsonProperty("bankInfoDto")
    private BankInfoDto bankinfodto;
    @JsonProperty("shopId")
    private Double shopid;
    @JsonProperty("shopName")
    private String shopname;

    public V2AccountNumberDDLDto() {
    }

    public Double getId() {

        return id;

    }

    public String getName() {

        return name;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getBankname() {

        return bankname;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public String getRealvanumber() {

        return realvanumber;

    }

    public BankInfoDto getBankinfodto() {

        return bankinfodto;

    }

    public Double getShopid() {

        return shopid;

    }

    public String getShopname() {

        return shopname;

    }

    public void setId(Double id) {

        this.id = id;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }

    public void setRealvanumber(String realvanumber) {

        this.realvanumber = realvanumber;

    }

    public void setBankinfodto(BankInfoDto bankinfodto) {

        this.bankinfodto = bankinfodto;

    }

    public void setShopid(Double shopid) {

        this.shopid = shopid;

    }

    public void setShopname(String shopname) {

        this.shopname = shopname;

    }
}
