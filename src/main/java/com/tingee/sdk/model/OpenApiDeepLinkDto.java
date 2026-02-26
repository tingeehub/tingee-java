package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiDeepLinkDto {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("type")
    private String type;
    @JsonProperty("qrCode")
    private String qrcode;
    @JsonProperty("redirectUrl")
    private String redirecturl;
    @JsonProperty("callbackUrl")
    private String callbackurl;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("destinationBankBin")
    private String destinationbankbin;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("content")
    private String content;
    @JsonProperty("billNumber")
    private String billnumber;

    public OpenApiDeepLinkDto() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getType() {

        return type;

    }

    public String getQrcode() {

        return qrcode;

    }

    public String getRedirecturl() {

        return redirecturl;

    }

    public String getCallbackurl() {

        return callbackurl;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getDestinationbankbin() {

        return destinationbankbin;

    }

    public String getAccountname() {

        return accountname;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public Double getAmount() {

        return amount;

    }

    public String getContent() {

        return content;

    }

    public String getBillnumber() {

        return billnumber;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setType(String type) {

        this.type = type;

    }

    public void setQrcode(String qrcode) {

        this.qrcode = qrcode;

    }

    public void setRedirecturl(String redirecturl) {

        this.redirecturl = redirecturl;

    }

    public void setCallbackurl(String callbackurl) {

        this.callbackurl = callbackurl;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setDestinationbankbin(String destinationbankbin) {

        this.destinationbankbin = destinationbankbin;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setAmount(Double amount) {

        this.amount = amount;

    }

    public void setContent(String content) {

        this.content = content;

    }

    public void setBillnumber(String billnumber) {

        this.billnumber = billnumber;

    }
}
