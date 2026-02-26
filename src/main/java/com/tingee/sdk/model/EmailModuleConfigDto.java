package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class EmailModuleConfigDto {
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("position")
    private Double position;
    @JsonProperty("email")
    private String email;
    @JsonProperty("title")
    private String title;

    public EmailModuleConfigDto() {
    }

    public Boolean getEnable() {

        return enable;

    }

    public Double getPosition() {

        return position;

    }

    public String getEmail() {

        return email;

    }

    public String getTitle() {

        return title;

    }

    public void setEnable(Boolean enable) {

        this.enable = enable;

    }

    public void setPosition(Double position) {

        this.position = position;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public void setTitle(String title) {

        this.title = title;

    }
}
