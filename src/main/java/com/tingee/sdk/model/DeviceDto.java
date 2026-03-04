package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class DeviceDto {
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
    @JsonProperty("type")
    private String type;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("system")
    private String system;
    @JsonProperty("systemVersion")
    private String systemversion;
    @JsonProperty("merchantId")
    private Double merchantid;
    @JsonProperty("assignedAgentId")
    private Double assignedagentid;
    @JsonProperty("merchantPhoneNumber")
    private String merchantphonenumber;
    @JsonProperty("employeeName")
    private String employeename;
    @JsonProperty("firebaseToken")
    private String firebasetoken;
    @JsonProperty("status")
    private String status;
    @JsonProperty("deviceInfoDto")
    private DeviceInfoDto deviceinfodto;
    @JsonProperty("useDate")
    private LocalDateTime usedate;
    @JsonProperty("securityCode")
    private String securitycode;
    @JsonProperty("selectedBankNames")
    private List<String> selectedbanknames;
    @JsonProperty("userReferralAncestorIds")
    private String userreferralancestorids;
    @JsonProperty("userReferralLevel")
    private Double userreferrallevel;
    @JsonProperty("deviceDistributorAncestorIds")
    private String devicedistributorancestorids;
    @JsonProperty("deviceDistributorLevel")
    private Double devicedistributorlevel;
    @JsonProperty("masterMerchantId")
    private Double mastermerchantid;
    @JsonProperty("merchantName")
    private String merchantname;
    @JsonProperty("shopDtos")
    private List<ShopInfoDto> shopdtos;
    @JsonProperty("agentName")
    private String agentname;
    @JsonProperty("agentId")
    private Double agentid;

    public DeviceDto() {
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

    public String getType() {

        return type;

    }

    public String getUuid() {

        return uuid;

    }

    public String getName() {

        return name;

    }

    public String getSystem() {

        return system;

    }

    public String getSystemversion() {

        return systemversion;

    }

    public Double getMerchantid() {

        return merchantid;

    }

    public Double getAssignedagentid() {

        return assignedagentid;

    }

    public String getMerchantphonenumber() {

        return merchantphonenumber;

    }

    public String getEmployeename() {

        return employeename;

    }

    public String getFirebasetoken() {

        return firebasetoken;

    }

    public String getStatus() {

        return status;

    }

    public DeviceInfoDto getDeviceinfodto() {

        return deviceinfodto;

    }

    public LocalDateTime getUsedate() {

        return usedate;

    }

    public String getSecuritycode() {

        return securitycode;

    }

    public List<String> getSelectedbanknames() {

        return selectedbanknames;

    }

    public String getUserreferralancestorids() {

        return userreferralancestorids;

    }

    public Double getUserreferrallevel() {

        return userreferrallevel;

    }

    public String getDevicedistributorancestorids() {

        return devicedistributorancestorids;

    }

    public Double getDevicedistributorlevel() {

        return devicedistributorlevel;

    }

    public Double getMastermerchantid() {

        return mastermerchantid;

    }

    public String getMerchantname() {

        return merchantname;

    }

    public List<ShopInfoDto> getShopdtos() {

        return shopdtos;

    }

    public String getAgentname() {

        return agentname;

    }

    public Double getAgentid() {

        return agentid;

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

    public void setType(String type) {

        this.type = type;

    }

    public void setUuid(String uuid) {

        this.uuid = uuid;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setSystem(String system) {

        this.system = system;

    }

    public void setSystemversion(String systemversion) {

        this.systemversion = systemversion;

    }

    public void setMerchantid(Double merchantid) {

        this.merchantid = merchantid;

    }

    public void setAssignedagentid(Double assignedagentid) {

        this.assignedagentid = assignedagentid;

    }

    public void setMerchantphonenumber(String merchantphonenumber) {

        this.merchantphonenumber = merchantphonenumber;

    }

    public void setEmployeename(String employeename) {

        this.employeename = employeename;

    }

    public void setFirebasetoken(String firebasetoken) {

        this.firebasetoken = firebasetoken;

    }

    public void setStatus(String status) {

        this.status = status;

    }

    public void setDeviceinfodto(DeviceInfoDto deviceinfodto) {

        this.deviceinfodto = deviceinfodto;

    }

    public void setUsedate(LocalDateTime usedate) {

        this.usedate = usedate;

    }

    public void setSecuritycode(String securitycode) {

        this.securitycode = securitycode;

    }

    public void setSelectedbanknames(List<String> selectedbanknames) {

        this.selectedbanknames = selectedbanknames;

    }

    public void setUserreferralancestorids(String userreferralancestorids) {

        this.userreferralancestorids = userreferralancestorids;

    }

    public void setUserreferrallevel(Double userreferrallevel) {

        this.userreferrallevel = userreferrallevel;

    }

    public void setDevicedistributorancestorids(String devicedistributorancestorids) {

        this.devicedistributorancestorids = devicedistributorancestorids;

    }

    public void setDevicedistributorlevel(Double devicedistributorlevel) {

        this.devicedistributorlevel = devicedistributorlevel;

    }

    public void setMastermerchantid(Double mastermerchantid) {

        this.mastermerchantid = mastermerchantid;

    }

    public void setMerchantname(String merchantname) {

        this.merchantname = merchantname;

    }

    public void setShopdtos(List<ShopInfoDto> shopdtos) {

        this.shopdtos = shopdtos;

    }

    public void setAgentname(String agentname) {

        this.agentname = agentname;

    }

    public void setAgentid(Double agentid) {

        this.agentid = agentid;

    }
}
