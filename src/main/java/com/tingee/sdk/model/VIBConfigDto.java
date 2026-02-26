package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class VIBConfigDto {
    @JsonProperty("vaPrefix")
    private String vaprefix;
    @JsonProperty("pathPublicKey")
    private FileUploadDto pathpublickey;
    @JsonProperty("pathPrivateKey")
    private FileUploadDto pathprivatekey;
    @JsonProperty("basicAuthToken")
    private String basicauthtoken;
    @JsonProperty("cif")
    private String cif;
    @JsonProperty("clientId")
    private String clientid;
    @JsonProperty("clientSecret")
    private String clientsecret;
    @JsonProperty("accountNumber")
    private String accountnumber;
    @JsonProperty("vaCharactersNumber")
    private Double vacharactersnumber;

    public VIBConfigDto() {
    }

    public String getVaprefix() {

        return vaprefix;

    }

    public FileUploadDto getPathpublickey() {

        return pathpublickey;

    }

    public FileUploadDto getPathprivatekey() {

        return pathprivatekey;

    }

    public String getBasicauthtoken() {

        return basicauthtoken;

    }

    public String getCif() {

        return cif;

    }

    public String getClientid() {

        return clientid;

    }

    public String getClientsecret() {

        return clientsecret;

    }

    public String getAccountnumber() {

        return accountnumber;

    }

    public Double getVacharactersnumber() {

        return vacharactersnumber;

    }

    public void setVaprefix(String vaprefix) {

        this.vaprefix = vaprefix;

    }

    public void setPathpublickey(FileUploadDto pathpublickey) {

        this.pathpublickey = pathpublickey;

    }

    public void setPathprivatekey(FileUploadDto pathprivatekey) {

        this.pathprivatekey = pathprivatekey;

    }

    public void setBasicauthtoken(String basicauthtoken) {

        this.basicauthtoken = basicauthtoken;

    }

    public void setCif(String cif) {

        this.cif = cif;

    }

    public void setClientid(String clientid) {

        this.clientid = clientid;

    }

    public void setClientsecret(String clientsecret) {

        this.clientsecret = clientsecret;

    }

    public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }

    public void setVacharactersnumber(Double vacharactersnumber) {

        this.vacharactersnumber = vacharactersnumber;

    }
}
