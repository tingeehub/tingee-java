package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiMerchantBankConfigPagedInputDto {
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("sorting")
    private String sorting;
    @JsonProperty("skipCount")
    private Double skipcount;
    @JsonProperty("maxResultCount")
    private Double maxresultcount;
    @JsonProperty("accountType")
    private BankAccountTypeEnum accounttype;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private BankNameEnum bankname;

    public OpenApiMerchantBankConfigPagedInputDto() {
    }

    public String getFilter() {

        return filter;

    }

    public String getSorting() {

        return sorting;

    }

    public Double getSkipcount() {

        return skipcount;

    }

    public Double getMaxresultcount() {

        return maxresultcount;

    }

    public BankAccountTypeEnum getAccounttype() {

        return accounttype;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getBankbin() {

        return bankbin;

    }

    public BankNameEnum getBankname() {

        return bankname;

    }

    public void setFilter(String filter) {

        this.filter = filter;

    }

    public void setSorting(String sorting) {

        this.sorting = sorting;

    }

    public void setSkipcount(Double skipcount) {

        this.skipcount = skipcount;

    }

    public void setMaxresultcount(Double maxresultcount) {

        this.maxresultcount = maxresultcount;

    }

    public void setAccounttype(BankAccountTypeEnum accounttype) {

        this.accounttype = accounttype;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(BankNameEnum bankname) {

        this.bankname = bankname;

    }
}
