package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiGetVAPagedInputDto {
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("sorting")
    private String sorting;
    @JsonProperty("skipCount")
    private Double skipcount;
    @JsonProperty("maxResultCount")
    private Double maxresultcount;
    @JsonProperty("startTime")
    private LocalDateTime starttime;
    @JsonProperty("endTime")
    private LocalDateTime endtime;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("shopId")
    private Double shopid;
    @JsonProperty("accountType")
    private String accounttype;
    @JsonProperty("agentId")
    private Double agentid;
    @JsonProperty("dataAccess")
    private String dataaccess;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private String bankname;

    public OpenApiGetVAPagedInputDto() {
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

    public LocalDateTime getStarttime() {

        return starttime;

    }

    public LocalDateTime getEndtime() {

        return endtime;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public Double getShopid() {

        return shopid;

    }

    public String getAccounttype() {

        return accounttype;

    }

    public Double getAgentid() {

        return agentid;

    }

    public String getDataaccess() {

        return dataaccess;

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

    public void setStarttime(LocalDateTime starttime) {

        this.starttime = starttime;

    }

    public void setEndtime(LocalDateTime endtime) {

        this.endtime = endtime;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setShopid(Double shopid) {

        this.shopid = shopid;

    }

    public void setAccounttype(String accounttype) {

        this.accounttype = accounttype;

    }

    public void setAgentid(Double agentid) {

        this.agentid = agentid;

    }

    public void setDataaccess(String dataaccess) {

        this.dataaccess = dataaccess;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }
}
