package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiRegisterDto {
    @JsonProperty("requestId")
    private String requestid;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("returnUrl")
    private String returnurl;

    public OpenApiRegisterDto() {
    }

    public String getRequestid() {

        return requestid;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getAccountname() {

        return accountname;

    }

    public String getPhone() {

        return phone;

    }

    public String getReturnurl() {

        return returnurl;

    }

    public void setRequestid(String requestid) {

        this.requestid = requestid;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setPhone(String phone) {

        this.phone = phone;

    }

    public void setReturnurl(String returnurl) {

        this.returnurl = returnurl;

    }
}
