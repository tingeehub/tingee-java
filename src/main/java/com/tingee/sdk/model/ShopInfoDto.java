package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class ShopInfoDto {
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private Double id;

    public ShopInfoDto() {
    }

    public String getName() {

        return name;

    }

    public Double getId() {

        return id;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setId(Double id) {

        this.id = id;

    }
}
