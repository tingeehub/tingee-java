package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiBillInfoDto {
    @JsonProperty("billId")
    private String billid;
    @JsonProperty("qrCodeType")
    private String qrcodetype;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;
    @JsonProperty("qrAccount")
    private String qraccount;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("totalAmountPaid")
    private Double totalamountpaid;
    @JsonProperty("totalPaymentsCount")
    private Double totalpaymentscount;
    @JsonProperty("expireInMinute")
    private Double expireinminute;
    @JsonProperty("extraInfo")
    private String extrainfo;
    @JsonProperty("status")
    private String status;

    public OpenApiBillInfoDto() {
    }

    public String getBillid() {

        return billid;

    }

    public String getQrcodetype() {

        return qrcodetype;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public String getQraccount() {

        return qraccount;

    }

    public Double getAmount() {

        return amount;

    }

    public String getPurpose() {

        return purpose;

    }

    public Double getTotalamountpaid() {

        return totalamountpaid;

    }

    public Double getTotalpaymentscount() {

        return totalpaymentscount;

    }

    public Double getExpireinminute() {

        return expireinminute;

    }

    public String getExtrainfo() {

        return extrainfo;

    }

    public String getStatus() {

        return status;

    }

    public void setBillid(String billid) {

        this.billid = billid;

    }

    public void setQrcodetype(String qrcodetype) {

        this.qrcodetype = qrcodetype;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }

    public void setQraccount(String qraccount) {

        this.qraccount = qraccount;

    }

    public void setAmount(Double amount) {

        this.amount = amount;

    }

    public void setPurpose(String purpose) {

        this.purpose = purpose;

    }

    public void setTotalamountpaid(Double totalamountpaid) {

        this.totalamountpaid = totalamountpaid;

    }

    public void setTotalpaymentscount(Double totalpaymentscount) {

        this.totalpaymentscount = totalpaymentscount;

    }

    public void setExpireinminute(Double expireinminute) {

        this.expireinminute = expireinminute;

    }

    public void setExtrainfo(String extrainfo) {

        this.extrainfo = extrainfo;

    }

    public void setStatus(String status) {

        this.status = status;

    }
}
