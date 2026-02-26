package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class ShinhanConfigDto {
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("clientId")
    private String clientid;
    @JsonProperty("clientSecret")
    private String clientsecret;
    @JsonProperty("pathPublicKey")
    private FileUploadDto pathpublickey;
    @JsonProperty("pathPrivateKey")
    private FileUploadDto pathprivatekey;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("accountName")
    private String accountname;

    public ShinhanConfigDto() {
    }

    public String getVaprefix() {

        return vaprefix;

    }

    public String getClientid() {

        return clientid;

    }

    public String getClientsecret() {

        return clientsecret;

    }

    public FileUploadDto getPathpublickey() {

        return pathpublickey;

    }

    public FileUploadDto getPathprivatekey() {

        return pathprivatekey;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public String getAccountname() {

        return accountname;

    }

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setClientid(String clientid) {

        this.clientid = clientid;

    }

    public void setClientsecret(String clientsecret) {

        this.clientsecret = clientsecret;

    }

    public void setPathpublickey(FileUploadDto pathpublickey) {

        this.pathpublickey = pathpublickey;

    }

    public void setPathprivatekey(FileUploadDto pathprivatekey) {

        this.pathprivatekey = pathprivatekey;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setAccountname(String accountname) {

        this.accountname = accountname;

    }
}
