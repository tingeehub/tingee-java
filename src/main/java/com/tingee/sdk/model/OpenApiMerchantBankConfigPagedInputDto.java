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
    private String accounttype;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private String bankname;

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

    public String getAccounttype() {

        return accounttype;

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

    public void setAccounttype(String accounttype) {

        this.accounttype = accounttype;

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
}
