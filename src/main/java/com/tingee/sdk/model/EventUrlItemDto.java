package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class EventUrlItemDto {
    @JsonProperty("url")
    private String url;
    @JsonProperty("type")
    private EventUrlItemType type;
    @JsonProperty("ids")
    private List<String> ids;

    public EventUrlItemDto() {
    }

    public String getUrl() {

        return url;

    }

    public EventUrlItemType getType() {

        return type;

    }

    public List<String> getIds() {

        return ids;

    }

    public void setUrl(String url) {

        this.url = url;

    }

    public void setType(EventUrlItemType type) {

        this.type = type;

    }

    public void setIds(List<String> ids) {

        this.ids = ids;

    }
}
