package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiOuputDto {
    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private Object data;

    public OpenApiOuputDto() {
    }

    public String getCode() {

        return code;

    }

    public String getMessage() {

        return message;

    }

    public Object getData() {

        return data;

    }

    public void setCode(String code) {

        this.code = code;

    }

    public void setMessage(String message) {

        this.message = message;

    }

    public void setData(Object data) {

        this.data = data;

    }
}
