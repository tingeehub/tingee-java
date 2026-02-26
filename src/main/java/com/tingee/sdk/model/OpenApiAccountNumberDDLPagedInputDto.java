package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiAccountNumberDDLPagedInputDto {
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
    @JsonProperty("merchantAccountNumberIds")
    private List<Double> merchantaccountnumberids;
    @JsonProperty("shopIds")
    private List<Double> shopids;
    @JsonProperty("realVANumbers")
    private List<String> realvanumbers;
    @JsonProperty("isGetMerchantCashAccountsNumber")
    private Boolean isgetmerchantcashaccountsnumber;
    @JsonProperty("bankBins")
    private List<String> bankbins;
    @JsonProperty("bankNames")
    private List<BankNameEnum> banknames;

    public OpenApiAccountNumberDDLPagedInputDto() {
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

    public List<Double> getMerchantaccountnumberids() {

        return merchantaccountnumberids;

    }

    public List<Double> getShopids() {

        return shopids;

    }

    public List<String> getRealvanumbers() {

        return realvanumbers;

    }

    public Boolean getIsgetmerchantcashaccountsnumber() {

        return isgetmerchantcashaccountsnumber;

    }

    public List<String> getBankbins() {

        return bankbins;

    }

    public List<BankNameEnum> getBanknames() {

        return banknames;

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

    public void setMerchantaccountnumberids(List<Double> merchantaccountnumberids) {

        this.merchantaccountnumberids = merchantaccountnumberids;

    }

    public void setShopids(List<Double> shopids) {

        this.shopids = shopids;

    }

    public void setRealvanumbers(List<String> realvanumbers) {

        this.realvanumbers = realvanumbers;

    }

    public void setIsgetmerchantcashaccountsnumber(Boolean isgetmerchantcashaccountsnumber) {

        this.isgetmerchantcashaccountsnumber = isgetmerchantcashaccountsnumber;

    }

    public void setBankbins(List<String> bankbins) {

        this.bankbins = bankbins;

    }

    public void setBanknames(List<BankNameEnum> banknames) {

        this.banknames = banknames;

    }
}
