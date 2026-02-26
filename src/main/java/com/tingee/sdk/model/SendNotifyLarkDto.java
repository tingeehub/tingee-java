package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class SendNotifyLarkDto {
    @JsonProperty("urlWebhook")
    private String urlwebhook;

    public SendNotifyLarkDto() {
    }

    public String getUrlwebhook() {

        return urlwebhook;

    }

    public void setUrlwebhook(String urlwebhook) {

        this.urlwebhook = urlwebhook;

    }
}
