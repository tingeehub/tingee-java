package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class MerchantDto {
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
    @JsonProperty("clientId")
    private String clientid;
    @JsonProperty("secretToken")
    private String secrettoken;
    @JsonProperty("eventUrl")
    private String eventurl;
    @JsonProperty("eventUrls")
    private List<EventUrlItemDto> eventurls;
    @JsonProperty("isLockEvent")
    private Boolean islockevent;
    @JsonProperty("bankConfigDto")
    private BankConfigDto bankconfigdto;
    @JsonProperty("bnplConfigDto")
    private BNPLConfigDto bnplconfigdto;
    @JsonProperty("directDebitConfigDto")
    private DirectDebitConfigDto directdebitconfigdto;
    @JsonProperty("sendNotifyPlatformDto")
    private SendNotifyPlatformDto sendnotifyplatformdto;
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
    @JsonProperty("merchantPackages")
    private List<MerchantPackageInfo> merchantpackages;

    public MerchantDto() {
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

    public String getClientid() {

        return clientid;

    }

    public String getSecrettoken() {

        return secrettoken;

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

    public BankConfigDto getBankconfigdto() {

        return bankconfigdto;

    }

    public BNPLConfigDto getBnplconfigdto() {

        return bnplconfigdto;

    }

    public DirectDebitConfigDto getDirectdebitconfigdto() {

        return directdebitconfigdto;

    }

    public SendNotifyPlatformDto getSendnotifyplatformdto() {

        return sendnotifyplatformdto;

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

    public List<MerchantPackageInfo> getMerchantpackages() {

        return merchantpackages;

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

    public void setClientid(String clientid) {

        this.clientid = clientid;

    }

    public void setSecrettoken(String secrettoken) {

        this.secrettoken = secrettoken;

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

    public void setBankconfigdto(BankConfigDto bankconfigdto) {

        this.bankconfigdto = bankconfigdto;

    }

    public void setBnplconfigdto(BNPLConfigDto bnplconfigdto) {

        this.bnplconfigdto = bnplconfigdto;

    }

    public void setDirectdebitconfigdto(DirectDebitConfigDto directdebitconfigdto) {

        this.directdebitconfigdto = directdebitconfigdto;

    }

    public void setSendnotifyplatformdto(SendNotifyPlatformDto sendnotifyplatformdto) {

        this.sendnotifyplatformdto = sendnotifyplatformdto;

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

    public void setMerchantpackages(List<MerchantPackageInfo> merchantpackages) {

        this.merchantpackages = merchantpackages;

    }
}
