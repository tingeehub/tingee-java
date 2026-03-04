package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiCreateMerchantDto {
    @JsonProperty("id")
    private Double id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phoneNumber")
    private String phonenumber;
    @JsonProperty("website")
    private String website;
    @JsonProperty("businessSectorIds")
    private List<Double> businesssectorids;
    @JsonProperty("provinceId")
    private String provinceid;
    @JsonProperty("districtId")
    private String districtid;
    @JsonProperty("communeId")
    private String communeid;
    @JsonProperty("address")
    private String address;
    @JsonProperty("fullAddress")
    private String fulladdress;
    @JsonProperty("eventUrl")
    private String eventurl;
    @JsonProperty("eventUrls")
    private List<EventUrlItemDto> eventurls;
    @JsonProperty("isLockEvent")
    private Boolean islockevent;
    @JsonProperty("isOrganizationUnit")
    private Boolean isorganizationunit;
    @JsonProperty("referralCode")
    private String referralcode;
    @JsonProperty("userReferralAncestorIds")
    private String userreferralancestorids;
    @JsonProperty("userReferralLevel")
    private Double userreferrallevel;
    @JsonProperty("deviceDistributorAncestorMap")
    private String devicedistributorancestormap;
    @JsonProperty("isMasterMerchant")
    private Boolean ismastermerchant;
    @JsonProperty("password")
    private String password;
    @JsonProperty("appType")
    private String apptype;
    @JsonProperty("isMultipleRole")
    private Boolean ismultiplerole;
    @JsonProperty("userReferrerId")
    private Double userreferrerid;

    public OpenApiCreateMerchantDto() {
    }

    public Double getId() {

        return id;

    }

    public String getCode() {

        return code;

    }

    public String getName() {

        return name;

    }

    public String getEmail() {

        return email;

    }

    public String getPhonenumber() {

        return phonenumber;

    }

    public String getWebsite() {

        return website;

    }

    public List<Double> getBusinesssectorids() {

        return businesssectorids;

    }

    public String getProvinceid() {

        return provinceid;

    }

    public String getDistrictid() {

        return districtid;

    }

    public String getCommuneid() {

        return communeid;

    }

    public String getAddress() {

        return address;

    }

    public String getFulladdress() {

        return fulladdress;

    }

    public String getEventurl() {

        return eventurl;

    }

    public List<EventUrlItemDto> getEventurls() {

        return eventurls;

    }

    public Boolean getIslockevent() {

        return islockevent;

    }

    public Boolean getIsorganizationunit() {

        return isorganizationunit;

    }

    public String getReferralcode() {

        return referralcode;

    }

    public String getUserreferralancestorids() {

        return userreferralancestorids;

    }

    public Double getUserreferrallevel() {

        return userreferrallevel;

    }

    public String getDevicedistributorancestormap() {

        return devicedistributorancestormap;

    }

    public Boolean getIsmastermerchant() {

        return ismastermerchant;

    }

    public String getPassword() {

        return password;

    }

    public String getApptype() {

        return apptype;

    }

    public Boolean getIsmultiplerole() {

        return ismultiplerole;

    }

    public Double getUserreferrerid() {

        return userreferrerid;

    }

    public void setId(Double id) {

        this.id = id;

    }

    public void setCode(String code) {

        this.code = code;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public void setPhonenumber(String phonenumber) {

        this.phonenumber = phonenumber;

    }

    public void setWebsite(String website) {

        this.website = website;

    }

    public void setBusinesssectorids(List<Double> businesssectorids) {

        this.businesssectorids = businesssectorids;

    }

    public void setProvinceid(String provinceid) {

        this.provinceid = provinceid;

    }

    public void setDistrictid(String districtid) {

        this.districtid = districtid;

    }

    public void setCommuneid(String communeid) {

        this.communeid = communeid;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public void setFulladdress(String fulladdress) {

        this.fulladdress = fulladdress;

    }

    public void setEventurl(String eventurl) {

        this.eventurl = eventurl;

    }

    public void setEventurls(List<EventUrlItemDto> eventurls) {

        this.eventurls = eventurls;

    }

    public void setIslockevent(Boolean islockevent) {

        this.islockevent = islockevent;

    }

    public void setIsorganizationunit(Boolean isorganizationunit) {

        this.isorganizationunit = isorganizationunit;

    }

    public void setReferralcode(String referralcode) {

        this.referralcode = referralcode;

    }

    public void setUserreferralancestorids(String userreferralancestorids) {

        this.userreferralancestorids = userreferralancestorids;

    }

    public void setUserreferrallevel(Double userreferrallevel) {

        this.userreferrallevel = userreferrallevel;

    }

    public void setDevicedistributorancestormap(String devicedistributorancestormap) {

        this.devicedistributorancestormap = devicedistributorancestormap;

    }

    public void setIsmastermerchant(Boolean ismastermerchant) {

        this.ismastermerchant = ismastermerchant;

    }

    public void setPassword(String password) {

        this.password = password;

    }

    public void setApptype(String apptype) {

        this.apptype = apptype;

    }

    public void setIsmultiplerole(Boolean ismultiplerole) {

        this.ismultiplerole = ismultiplerole;

    }

    public void setUserreferrerid(Double userreferrerid) {

        this.userreferrerid = userreferrerid;

    }
}
