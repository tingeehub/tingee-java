package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class PagedResultDto {
    @JsonProperty("totalCount")
    private Double totalcount;

    public PagedResultDto() {
    }

    public Double getTotalcount() {

        return totalcount;

    }

    public void setTotalcount(Double totalcount) {

        this.totalcount = totalcount;

    }
}
