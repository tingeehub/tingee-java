package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiPaymentBillDto {
    @JsonProperty("requestId")
    private String requestid;
    @JsonProperty("clientId")
    private String clientid;
    @JsonProperty("subscriptionId")
    private String subscriptionid;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("description")
    private String description;
    @JsonProperty("expirationTime")
    private String expirationtime;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("token")
    private String token;
    @JsonProperty("additionalData")
    private Object additionaldata;
    @JsonProperty("tokenRef")
    private String tokenref;
    @JsonProperty("partnerCode")
    private String partnercode;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("serviceProviderName")
    private String serviceprovidername;
    @JsonProperty("returnUrl")
    private String returnurl;

    public OpenApiPaymentBillDto() {
    }

    public String getRequestid() {

        return requestid;

    }

    public String getClientid() {

        return clientid;

    }

    public String getSubscriptionid() {

        return subscriptionid;

    }

    public String getAmount() {

        return amount;

    }

    public String getDescription() {

        return description;

    }

    public String getExpirationtime() {

        return expirationtime;

    }

    public String getSignature() {

        return signature;

    }

    public String getToken() {

        return token;

    }

    public Object getAdditionaldata() {

        return additionaldata;

    }

    public String getTokenref() {

        return tokenref;

    }

    public String getPartnercode() {

        return partnercode;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getServiceprovidername() {

        return serviceprovidername;

    }

    public String getReturnurl() {

        return returnurl;

    }

    public void setRequestid(String requestid) {

        this.requestid = requestid;

    }

    public void setClientid(String clientid) {

        this.clientid = clientid;

    }

    public void setSubscriptionid(String subscriptionid) {

        this.subscriptionid = subscriptionid;

    }

    public void setAmount(String amount) {

        this.amount = amount;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public void setExpirationtime(String expirationtime) {

        this.expirationtime = expirationtime;

    }

    public void setSignature(String signature) {

        this.signature = signature;

    }

    public void setToken(String token) {

        this.token = token;

    }

    public void setAdditionaldata(Object additionaldata) {

        this.additionaldata = additionaldata;

    }

    public void setTokenref(String tokenref) {

        this.tokenref = tokenref;

    }

    public void setPartnercode(String partnercode) {

        this.partnercode = partnercode;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setServiceprovidername(String serviceprovidername) {

        this.serviceprovidername = serviceprovidername;

    }

    public void setReturnurl(String returnurl) {

        this.returnurl = returnurl;

    }
}
