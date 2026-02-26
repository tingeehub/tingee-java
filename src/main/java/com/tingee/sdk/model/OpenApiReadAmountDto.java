package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiReadAmountDto {
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("transactionId")
    private String transactionid;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private BankNameEnum bankname;
    @JsonProperty("firstDisplayText")
    private String firstdisplaytext;
    @JsonProperty("secondDisplayText")
    private String seconddisplaytext;
    @JsonProperty("thirdDisplayText")
    private String thirddisplaytext;
    @JsonProperty("playSound")
    private Boolean playsound;

    public OpenApiReadAmountDto() {
    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getUuid() {

        return uuid;

    }

    public String getTransactionid() {

        return transactionid;

    }

    public Double getAmount() {

        return amount;

    }

    public String getBankbin() {

        return bankbin;

    }

    public BankNameEnum getBankname() {

        return bankname;

    }

    public String getFirstdisplaytext() {

        return firstdisplaytext;

    }

    public String getSeconddisplaytext() {

        return seconddisplaytext;

    }

    public String getThirddisplaytext() {

        return thirddisplaytext;

    }

    public Boolean getPlaysound() {

        return playsound;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setUuid(String uuid) {

        this.uuid = uuid;

    }

    public void setTransactionid(String transactionid) {

        this.transactionid = transactionid;

    }

    public void setAmount(Double amount) {

        this.amount = amount;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(BankNameEnum bankname) {

        this.bankname = bankname;

    }

    public void setFirstdisplaytext(String firstdisplaytext) {

        this.firstdisplaytext = firstdisplaytext;

    }

    public void setSeconddisplaytext(String seconddisplaytext) {

        this.seconddisplaytext = seconddisplaytext;

    }

    public void setThirddisplaytext(String thirddisplaytext) {

        this.thirddisplaytext = thirddisplaytext;

    }

    public void setPlaysound(Boolean playsound) {

        this.playsound = playsound;

    }
}
