package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class VPBInfoDto {
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("identity")
    private String identity;
    @JsonProperty("registerId")
    private String registerid;
    @JsonProperty("bankRegisterId")
    private String bankregisterid;
    @JsonProperty("isWaitingForApproveDelete")
    private Boolean iswaitingforapprovedelete;
    @JsonProperty("softposUserName")
    private String softposusername;
    @JsonProperty("softposDeveloperId")
    private String softposdeveloperid;
    @JsonProperty("softposTid")
    private String softpostid;
    @JsonProperty("softposMid")
    private String softposmid;

    public VPBInfoDto() {
    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getAccountname() {

        return accountname;

    }

    public String getIdentity() {

        return identity;

    }

    public String getRegisterid() {

        return registerid;

    }

    public String getBankregisterid() {

        return bankregisterid;

    }

    public Boolean getIswaitingforapprovedelete() {

        return iswaitingforapprovedelete;

    }

    public String getSoftposusername() {

        return softposusername;

    }

    public String getSoftposdeveloperid() {

        return softposdeveloperid;

    }

    public String getSoftpostid() {

        return softpostid;

    }

    public String getSoftposmid() {

        return softposmid;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setIdentity(String identity) {

        this.identity = identity;

    }

    public void setRegisterid(String registerid) {

        this.registerid = registerid;

    }

    public void setBankregisterid(String bankregisterid) {

        this.bankregisterid = bankregisterid;

    }

    public void setIswaitingforapprovedelete(Boolean iswaitingforapprovedelete) {

        this.iswaitingforapprovedelete = iswaitingforapprovedelete;

    }

    public void setSoftposusername(String softposusername) {

        this.softposusername = softposusername;

    }

    public void setSoftposdeveloperid(String softposdeveloperid) {

        this.softposdeveloperid = softposdeveloperid;

    }

    public void setSoftpostid(String softpostid) {

        this.softpostid = softpostid;

    }

    public void setSoftposmid(String softposmid) {

        this.softposmid = softposmid;

    }
}
