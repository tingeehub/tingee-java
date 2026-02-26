package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OnePayConfigDto {
    @JsonProperty("merchantId")
    private String merchantid;
    @JsonProperty("signingKey")
    private String signingkey;
    @JsonProperty("verifyKey")
    private String verifykey;
    @JsonProperty("accessCode")
    private String accesscode;
    @JsonProperty("hashCode")
    private String hashcode;
    @JsonProperty("callbackUrl")
    private String callbackurl;

    public OnePayConfigDto() {
    }

    public String getMerchantid() {

        return merchantid;

    }

    public String getSigningkey() {

        return signingkey;

    }

    public String getVerifykey() {

        return verifykey;

    }

    public String getAccesscode() {

        return accesscode;

    }

    public String getHashcode() {

        return hashcode;

    }

    public String getCallbackurl() {

        return callbackurl;

    }

    public void setMerchantid(String merchantid) {

        this.merchantid = merchantid;

    }

    public void setSigningkey(String signingkey) {

        this.signingkey = signingkey;

    }

    public void setVerifykey(String verifykey) {

        this.verifykey = verifykey;

    }

    public void setAccesscode(String accesscode) {

        this.accesscode = accesscode;

    }

    public void setHashcode(String hashcode) {

        this.hashcode = hashcode;

    }

    public void setCallbackurl(String callbackurl) {

        this.callbackurl = callbackurl;

    }
}
