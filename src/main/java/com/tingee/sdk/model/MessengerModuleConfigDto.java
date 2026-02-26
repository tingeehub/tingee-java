package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class MessengerModuleConfigDto {
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("position")
    private Double position;
    @JsonProperty("pageId")
    private String pageid;
    @JsonProperty("title")
    private String title;

    public MessengerModuleConfigDto() {
    }

    public Boolean getEnable() {

        return enable;

    }

    public Double getPosition() {

        return position;

    }

    public String getPageid() {

        return pageid;

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

    public void setPageid(String pageid) {

        this.pageid = pageid;

    }

    public void setTitle(String title) {

        this.title = title;

    }
}
