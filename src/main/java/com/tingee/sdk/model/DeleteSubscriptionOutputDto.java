package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class DeleteSubscriptionOutputDto {
    @JsonProperty("confirmUrl")
    private String confirmurl;
    @JsonProperty("code")
    private String code;

    public DeleteSubscriptionOutputDto() {
    }

    public String getConfirmurl() {

        return confirmurl;

    }

    public String getCode() {

        return code;

    }

    public void setConfirmurl(String confirmurl) {

        this.confirmurl = confirmurl;

    }

    public void setCode(String code) {

        this.code = code;

    }
}
