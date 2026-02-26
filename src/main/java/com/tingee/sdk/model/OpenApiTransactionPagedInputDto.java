package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiTransactionPagedInputDto {
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("sorting")
    private String sorting;
    @JsonProperty("skipCount")
    private Double skipcount;
    @JsonProperty("maxResultCount")
    private Double maxresultcount;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("shopIds")
    private List<Double> shopids;
    @JsonProperty("vaAccountNumbers")
    private List<String> vaaccountnumbers;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("billId")
    private String billid;
    @JsonProperty("startTime")
    private String starttime;
    @JsonProperty("endTime")
    private String endtime;

    public OpenApiTransactionPagedInputDto() {
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

    public Double getMerchantid() {

        return merchantid;

    }

    public List<Double> getShopids() {

        return shopids;

    }

    public List<String> getVaaccountnumbers() {

        return vaaccountnumbers;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getBillid() {

        return billid;

    }

    public String getStarttime() {

        return starttime;

    }

    public String getEndtime() {

        return endtime;

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

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setShopids(List<Double> shopids) {

        this.shopids = shopids;

    }

    public void setVaaccountnumbers(List<String> vaaccountnumbers) {

        this.vaaccountnumbers = vaaccountnumbers;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBillid(String billid) {

        this.billid = billid;

    }

    public void setStarttime(String starttime) {

        this.starttime = starttime;

    }

    public void setEndtime(String endtime) {

        this.endtime = endtime;

    }
}
