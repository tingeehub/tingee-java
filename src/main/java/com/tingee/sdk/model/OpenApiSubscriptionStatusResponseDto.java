package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiSubscriptionStatusResponseDto {
    @JsonProperty("lastModificationTime")
    private LocalDateTime lastmodificationtime;
    @JsonProperty("lastModifierUserId")
    private Double lastmodifieruserid;
    @JsonProperty("email")
    private String email;
    @JsonProperty("bankName")
    private String bankname;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("confirmPaymentByEmail")
    private Boolean confirmpaymentbyemail;
    @JsonProperty("confirmEmail")
    private String confirmemail;
    @JsonProperty("confirmPaymentByZalo")
    private Boolean confirmpaymentbyzalo;
    @JsonProperty("confirmPhoneNumber")
    private String confirmphonenumber;
    @JsonProperty("tokenRef")
    private String tokenref;
    @JsonProperty("status")
    private String status;
    @JsonProperty("subscriptionId")
    private String subscriptionid;
    @JsonProperty("bankBin")
    private String bankbin;

    public OpenApiSubscriptionStatusResponseDto() {
    }

    public LocalDateTime getLastmodificationtime() {

        return lastmodificationtime;

    }

    public Double getLastmodifieruserid() {

        return lastmodifieruserid;

    }

    public String getEmail() {

        return email;

    }

    public String getBankname() {

        return bankname;

    }

    public String getAccountname() {

        return accountname;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getPhone() {

        return phone;

    }

    public Boolean getConfirmpaymentbyemail() {

        return confirmpaymentbyemail;

    }

    public String getConfirmemail() {

        return confirmemail;

    }

    public Boolean getConfirmpaymentbyzalo() {

        return confirmpaymentbyzalo;

    }

    public String getConfirmphonenumber() {

        return confirmphonenumber;

    }

    public String getTokenref() {

        return tokenref;

    }

    public String getStatus() {

        return status;

    }

    public String getSubscriptionid() {

        return subscriptionid;

    }

    public String getBankbin() {

        return bankbin;

    }

    public void setLastmodificationtime(LocalDateTime lastmodificationtime) {

        this.lastmodificationtime = lastmodificationtime;

    }

    public void setLastmodifieruserid(Double lastmodifieruserid) {

        this.lastmodifieruserid = lastmodifieruserid;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setPhone(String phone) {

        this.phone = phone;

    }

    public void setConfirmpaymentbyemail(Boolean confirmpaymentbyemail) {

        this.confirmpaymentbyemail = confirmpaymentbyemail;

    }

    public void setConfirmemail(String confirmemail) {

        this.confirmemail = confirmemail;

    }

    public void setConfirmpaymentbyzalo(Boolean confirmpaymentbyzalo) {

        this.confirmpaymentbyzalo = confirmpaymentbyzalo;

    }

    public void setConfirmphonenumber(String confirmphonenumber) {

        this.confirmphonenumber = confirmphonenumber;

    }

    public void setTokenref(String tokenref) {

        this.tokenref = tokenref;

    }

    public void setStatus(String status) {

        this.status = status;

    }

    public void setSubscriptionid(String subscriptionid) {

        this.subscriptionid = subscriptionid;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }
}
