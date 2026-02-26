package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class GoogleModuleConfigDto {
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("position")
    private Double position;
    @JsonProperty("placeId")
    private String placeid;
    @JsonProperty("title")
    private String title;

    public GoogleModuleConfigDto() {
    }

    public Boolean getEnable() {

        return enable;

    }

    public Double getPosition() {

        return position;

    }

    public String getPlaceid() {

        return placeid;

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

    public void setPlaceid(String placeid) {

        this.placeid = placeid;

    }

    public void setTitle(String title) {

        this.title = title;

    }
}
