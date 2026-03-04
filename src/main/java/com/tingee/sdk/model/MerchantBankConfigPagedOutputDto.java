package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class MerchantBankConfigPagedOutputDto {
    @JsonProperty("id")
    private Double id;
    @JsonProperty("creationTime")
    private LocalDateTime creationtime;
    @JsonProperty("creatorUserId")
    private Double creatoruserid;
    @JsonProperty("lastModificationTime")
    private LocalDateTime lastmodificationtime;
    @JsonProperty("lastModifierUserId")
    private Double lastmodifieruserid;
    @JsonProperty("deleterUserId")
    private Double deleteruserid;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("accountType")
    private String accounttype;
    @JsonProperty("configDto")
    private Object configdto;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private String bankname;

    public MerchantBankConfigPagedOutputDto() {
    }

    public Double getId() {

        return id;

    }

    public LocalDateTime getCreationtime() {

        return creationtime;

    }

    public Double getCreatoruserid() {

        return creatoruserid;

    }

    public LocalDateTime getLastmodificationtime() {

        return lastmodificationtime;

    }

    public Double getLastmodifieruserid() {

        return lastmodifieruserid;

    }

    public Double getDeleteruserid() {

        return deleteruserid;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getAccounttype() {

        return accounttype;

    }

    public Object getConfigdto() {

        return configdto;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getBankname() {

        return bankname;

    }

    public void setId(Double id) {

        this.id = id;

    }

    public void setCreationtime(LocalDateTime creationtime) {

        this.creationtime = creationtime;

    }

    public void setCreatoruserid(Double creatoruserid) {

        this.creatoruserid = creatoruserid;

    }

    public void setLastmodificationtime(LocalDateTime lastmodificationtime) {

        this.lastmodificationtime = lastmodificationtime;

    }

    public void setLastmodifieruserid(Double lastmodifieruserid) {

        this.lastmodifieruserid = lastmodifieruserid;

    }

    public void setDeleteruserid(Double deleteruserid) {

        this.deleteruserid = deleteruserid;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setAccounttype(String accounttype) {

        this.accounttype = accounttype;

    }

    public void setConfigdto(Object configdto) {

        this.configdto = configdto;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }
}
