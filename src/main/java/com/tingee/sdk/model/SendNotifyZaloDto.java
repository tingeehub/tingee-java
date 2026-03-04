package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class SendNotifyZaloDto {
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;

    public SendNotifyZaloDto() {
    }

    public String getType() {

        return type;

    }

    public String getName() {

        return name;

    }

    public void setType(String type) {

        this.type = type;

    }

    public void setName(String name) {

        this.name = name;

    }
}
