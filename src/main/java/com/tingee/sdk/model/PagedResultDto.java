package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class PagedResultDto<T> {
    @JsonProperty("totalCount")
    private Double totalcount;

    @JsonProperty("items")
    private List<T> items;

    public PagedResultDto() {
    }

    public Double getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Double totalcount) {
        this.totalcount = totalcount;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
