package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiCreateVAInpuDto {
    @JsonProperty("name")
    private String name;
    @JsonProperty("cashFlowSource")
    private String cashflowsource;
    @JsonProperty("accountType")
    private String accounttype;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("accountName")
    private String accountname;
    @JsonProperty("identity")
    private String identity;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("masterMerchantId")
    private Double mastermerchantid;
    @JsonProperty("shopId")
    private Double shopid;
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("vaSuffix")
    private String vasuffix;
    @JsonProperty("merchantName")
    private String merchantname;
    @JsonProperty("merchantAddress")
    private String merchantaddress;
    @JsonProperty("serviceId")
    private Double serviceid;
    @JsonProperty("isCreateNonOtp")
    private Boolean iscreatenonotp;
    @JsonProperty("code")
    private String code;
    @JsonProperty("taxCode")
    private String taxcode;
    @JsonProperty("softposUserName")
    private String softposusername;
    @JsonProperty("softposDeveloperId")
    private String softposdeveloperid;
    @JsonProperty("softposTid")
    private String softpostid;
    @JsonProperty("softposMid")
    private String softposmid;
    @JsonProperty("authorizationCode")
    private String authorizationcode;
    @JsonProperty("sessionLogin")
    private String sessionlogin;
    @JsonProperty("isNotifyAccountNumber")
    private Boolean isnotifyaccountnumber;
    @JsonProperty("appType")
    private String apptype;
    @JsonProperty("linkType")
    private String linktype;
    @JsonProperty("vaAccountNumber")
    private String vaaccountnumber;
    @JsonProperty("acbUserId")
    private String acbuserid;
    @JsonProperty("bankBin")
    private String bankbin;
    @JsonProperty("bankName")
    private String bankname;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("redirectUrl")
    private String redirecturl;
    @JsonProperty("webhookUrl")
    private String webhookurl;

    public OpenApiCreateVAInpuDto() {
    }

    public String getName() {

        return name;

    }

    public String getCashflowsource() {

        return cashflowsource;

    }

    public String getAccounttype() {

        return accounttype;

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

    public String getMobile() {

        return mobile;

    }

    public Double getMastermerchantid() {

        return mastermerchantid;

    }

    public Double getShopid() {

        return shopid;

    }

    public String getVaprefix() {

        return vaprefix;

    }

    public String getVasuffix() {

        return vasuffix;

    }

    public String getMerchantname() {

        return merchantname;

    }

    public String getMerchantaddress() {

        return merchantaddress;

    }

    public Double getServiceid() {

        return serviceid;

    }

    public Boolean getIscreatenonotp() {

        return iscreatenonotp;

    }

    public String getCode() {

        return code;

    }

    public String getTaxcode() {

        return taxcode;

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

    public String getAuthorizationcode() {

        return authorizationcode;

    }

    public String getSessionlogin() {

        return sessionlogin;

    }

    public Boolean getIsnotifyaccountnumber() {

        return isnotifyaccountnumber;

    }

    public String getApptype() {

        return apptype;

    }

    public String getLinktype() {

        return linktype;

    }

    public String getVaaccountnumber() {

        return vaaccountnumber;

    }

    public String getAcbuserid() {

        return acbuserid;

    }

    public String getBankbin() {

        return bankbin;

    }

    public String getBankname() {

        return bankname;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public String getRedirecturl() {

        return redirecturl;

    }

    public String getWebhookurl() {

        return webhookurl;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setCashflowsource(String cashflowsource) {

        this.cashflowsource = cashflowsource;

    }

    public void setAccounttype(String accounttype) {

        this.accounttype = accounttype;

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

    public void setMobile(String mobile) {

        this.mobile = mobile;

    }

    public void setMastermerchantid(Double mastermerchantid) {

        this.mastermerchantid = mastermerchantid;

    }

    public void setShopid(Double shopid) {

        this.shopid = shopid;

    }

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setVasuffix(String vasuffix) {

        this.vasuffix = vasuffix;

    }

    public void setMerchantname(String merchantname) {

        this.merchantname = merchantname;

    }

    public void setMerchantaddress(String merchantaddress) {

        this.merchantaddress = merchantaddress;

    }

    public void setServiceid(Double serviceid) {

        this.serviceid = serviceid;

    }

    public void setIscreatenonotp(Boolean iscreatenonotp) {

        this.iscreatenonotp = iscreatenonotp;

    }

    public void setCode(String code) {

        this.code = code;

    }

    public void setTaxcode(String taxcode) {

        this.taxcode = taxcode;

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

    public void setAuthorizationcode(String authorizationcode) {

        this.authorizationcode = authorizationcode;

    }

    public void setSessionlogin(String sessionlogin) {

        this.sessionlogin = sessionlogin;

    }

    public void setIsnotifyaccountnumber(Boolean isnotifyaccountnumber) {

        this.isnotifyaccountnumber = isnotifyaccountnumber;

    }

    public void setApptype(String apptype) {

        this.apptype = apptype;

    }

    public void setLinktype(String linktype) {

        this.linktype = linktype;

    }

    public void setVaaccountnumber(String vaaccountnumber) {

        this.vaaccountnumber = vaaccountnumber;

    }

    public void setAcbuserid(String acbuserid) {

        this.acbuserid = acbuserid;

    }

    public void setBankbin(String bankbin) {

        this.bankbin = bankbin;

    }

    public void setBankname(String bankname) {

        this.bankname = bankname;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setRedirecturl(String redirecturl) {

        this.redirecturl = redirecturl;

    }

    public void setWebhookurl(String webhookurl) {

        this.webhookurl = webhookurl;

    }
}
