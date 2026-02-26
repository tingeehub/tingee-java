package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class PaymentModuleConfigDto {
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("position")
    private Double position;
    @JsonProperty("accountNumberIds")
    private List<String> accountnumberids;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;

    public PaymentModuleConfigDto() {
    }

    public Boolean getEnable() {

        return enable;

    }

    public Double getPosition() {

        return position;

    }

    public List<String> getAccountnumberids() {

        return accountnumberids;

    }

    public String getTitle() {

        return title;

    }

    public String getDescription() {

        return description;

    }

    public void setEnable(Boolean enable) {

        this.enable = enable;

    }

    public void setPosition(Double position) {

        this.position = position;

    }

    public void setAccountnumberids(List<String> accountnumberids) {

        this.accountnumberids = accountnumberids;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public void setDescription(String description) {

        this.description = description;

    }
}
