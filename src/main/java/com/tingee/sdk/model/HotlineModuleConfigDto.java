package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class HotlineModuleConfigDto {
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("position")
    private Double position;
    @JsonProperty("phoneNumber")
    private String phonenumber;
    @JsonProperty("title")
    private String title;

    public HotlineModuleConfigDto() {
    }

    public Boolean getEnable() {

        return enable;

    }

    public Double getPosition() {

        return position;

    }

    public String getPhonenumber() {

        return phonenumber;

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

    public void setPhonenumber(String phonenumber) {

        this.phonenumber = phonenumber;

    }

    public void setTitle(String title) {

        this.title = title;

    }
}
