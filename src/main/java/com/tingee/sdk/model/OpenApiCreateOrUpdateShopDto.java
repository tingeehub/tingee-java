package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiCreateOrUpdateShopDto {
    @JsonProperty("id")
    private Double id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phoneNumber")
    private String phonenumber;
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
    @JsonProperty("sendNotifyPlatformDto")
    private SendNotifyPlatformDto sendnotifyplatformdto;
    @JsonProperty("isActive")
    private Boolean isactive;
    @JsonProperty("status")
    private String status;
    @JsonProperty("userReferralAncestorIds")
    private String userreferralancestorids;
    @JsonProperty("userReferralLevel")
    private Double userreferrallevel;
    @JsonProperty("deviceDistributorAncestorMap")
    private String devicedistributorancestormap;
    @JsonProperty("merchantId")
    private Double merchantid;

    public OpenApiCreateOrUpdateShopDto() {
    }

    public Double getId() {

        return id;

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

    public SendNotifyPlatformDto getSendnotifyplatformdto() {

        return sendnotifyplatformdto;

    }

    public Boolean getIsactive() {

        return isactive;

    }

    public String getStatus() {

        return status;

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

    public Double getMerchantid() {

        return merchantid;

    }

    public void setId(Double id) {

        this.id = id;

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

    public void setSendnotifyplatformdto(SendNotifyPlatformDto sendnotifyplatformdto) {

        this.sendnotifyplatformdto = sendnotifyplatformdto;

    }

    public void setIsactive(Boolean isactive) {

        this.isactive = isactive;

    }

    public void setStatus(String status) {

        this.status = status;

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

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }
}
