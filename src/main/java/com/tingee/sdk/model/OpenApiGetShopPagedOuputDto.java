package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiGetShopPagedOuputDto {
    @JsonProperty("id")
    private Double id;
    @JsonProperty("isActive")
    private Boolean isactive;
    @JsonProperty("name")
    private Double name;
    @JsonProperty("address")
    private String address;

    public OpenApiGetShopPagedOuputDto() {
    }

    public Double getId() {

        return id;

    }

    public Boolean getIsactive() {

        return isactive;

    }

    public Double getName() {

        return name;

    }

    public String getAddress() {

        return address;

    }

    public void setId(Double id) {

        this.id = id;

    }

    public void setIsactive(Boolean isactive) {

        this.isactive = isactive;

    }

    public void setName(Double name) {

        this.name = name;

    }

    public void setAddress(String address) {

        this.address = address;

    }
}
