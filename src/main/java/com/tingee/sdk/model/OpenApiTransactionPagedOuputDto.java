package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiTransactionPagedOuputDto {
    @JsonProperty("transactionId")
    private String transactionid;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("shopId")
    private Double shopid;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("cashFlowSource")
    private CashFlowSourceEnum cashflowsource;
    @JsonProperty("code")
    private String code;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("type")
    private String type;
    @JsonProperty("content")
    private String content;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;
    @JsonProperty("transactionDate")
    private String transactiondate;
    @JsonProperty("billId")
    private String billid;

    public OpenApiTransactionPagedOuputDto() {
    }

    public String getTransactionid() {

        return transactionid;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public Double getShopid() {

        return shopid;

    }

    public String getBankbin() {

        return bankbin;

    }

    public CashFlowSourceEnum getCashflowsource() {

        return cashflowsource;

    }

    public String getCode() {

        return code;

    }

    public Double getAmount() {

        return amount;

    }

    public String getType() {

        return type;

    }

    public String getContent() {

        return content;

    }

    public String getCurrency() {

        return currency;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public String getTransactiondate() {

        return transactiondate;

    }

    public String getBillid() {

        return billid;

    }

    public void setTransactionid(String transactionid) {

        this.transactionid = transactionid;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setShopid(Double shopid) {

        this.shopid = shopid;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setCashflowsource(CashFlowSourceEnum cashflowsource) {

        this.cashflowsource = cashflowsource;

    }

    public void setCode(String code) {

        this.code = code;

    }

    public void setAmount(Double amount) {

        this.amount = amount;

    }

    public void setType(String type) {

        this.type = type;

    }

    public void setContent(String content) {

        this.content = content;

    }

    public void setCurrency(String currency) {

        this.currency = currency;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }

    public void setTransactiondate(String transactiondate) {

        this.transactiondate = transactiondate;

    }

    public void setBillid(String billid) {

        this.billid = billid;

    }
}
