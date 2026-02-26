package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OCBConfigDto {
    @JsonProperty("clientId")
    private String clientid;
    @JsonProperty("clientSecret")
    private String clientsecret;
    @JsonProperty("pathCertKey")
    private FileUploadDto pathcertkey;
    @JsonProperty("pathPrivateKey")
    private FileUploadDto pathprivatekey;
    @JsonProperty("userName")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("vaPrefixForDynamicQR")
    private String vaprefixfordynamicqr;
    @JsonProperty("accountNumbers")
    private List<String> accountnumbers;

    public OCBConfigDto() {
    }

    public String getClientid() {

        return clientid;

    }

    public String getClientsecret() {

        return clientsecret;

    }

    public FileUploadDto getPathcertkey() {

        return pathcertkey;

    }

    public FileUploadDto getPathprivatekey() {

        return pathprivatekey;

    }

    public String getUsername() {

        return username;

    }

    public String getPassword() {

        return password;

    }

    public String getVaprefix() {

        return vaprefix;

    }

    public String getVaprefixfordynamicqr() {

        return vaprefixfordynamicqr;

    }

    public List<String> getAccountnumbers() {

        return accountnumbers;

    }

    public void setClientid(String clientid) {

        this.clientid = clientid;

    }

    public void setClientsecret(String clientsecret) {

        this.clientsecret = clientsecret;

    }

    public void setPathcertkey(FileUploadDto pathcertkey) {

        this.pathcertkey = pathcertkey;

    }

    public void setPathprivatekey(FileUploadDto pathprivatekey) {

        this.pathprivatekey = pathprivatekey;

    }

    public void setUsername(String username) {

        this.username = username;

    }

    public void setPassword(String password) {

        this.password = password;

    }

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setVaprefixfordynamicqr(String vaprefixfordynamicqr) {

        this.vaprefixfordynamicqr = vaprefixfordynamicqr;

    }

    public void setAccountnumbers(List<String> accountnumbers) {

        this.accountnumbers = accountnumbers;

    }
}
