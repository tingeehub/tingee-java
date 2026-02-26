package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class ZaloModuleConfigDto {
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("position")
    private Double position;
    @JsonProperty("zaloId")
    private String zaloid;
    @JsonProperty("title")
    private String title;

    public ZaloModuleConfigDto() {
    }

    public Boolean getEnable() {

        return enable;

    }

    public Double getPosition() {

        return position;

    }

    public String getZaloid() {

        return zaloid;

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

    public void setZaloid(String zaloid) {

        this.zaloid = zaloid;

    }

    public void setTitle(String title) {

        this.title = title;

    }
}
