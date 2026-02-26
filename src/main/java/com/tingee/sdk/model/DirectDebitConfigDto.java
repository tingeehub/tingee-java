package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class DirectDebitConfigDto {
    @JsonProperty("onePayConfigDto")
    private OnePayConfigDto onepayconfigdto;

    public DirectDebitConfigDto() {
    }

    public OnePayConfigDto getOnepayconfigdto() {

        return onepayconfigdto;

    }

    public void setOnepayconfigdto(OnePayConfigDto onepayconfigdto) {

        this.onepayconfigdto = onepayconfigdto;

    }
}
