package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class VCBBaasDto {
    @JsonProperty("requestId")
    private String requestid;
    @JsonProperty("redirectUrl")
    private String redirecturl;
    @JsonProperty("webhookUrl")
    private String webhookurl;

    public VCBBaasDto() {
    }

    public String getRequestid() {

        return requestid;

    }

    public String getRedirecturl() {

        return redirecturl;

    }

    public String getWebhookurl() {

        return webhookurl;

    }

    public void setRequestid(String requestid) {

        this.requestid = requestid;

    }

    public void setRedirecturl(String redirecturl) {

        this.redirecturl = redirecturl;

    }

    public void setWebhookurl(String webhookurl) {

        this.webhookurl = webhookurl;

    }
}
