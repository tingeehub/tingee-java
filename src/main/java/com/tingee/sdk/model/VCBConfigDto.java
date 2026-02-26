package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class VCBConfigDto {
    @JsonProperty("businessAccounts")
    private List<VCBConfigBusinessDto> businessaccounts;
    @JsonProperty("businessHouseholdAccounts")
    private List<VCBConfigBusinessDto> businesshouseholdaccounts;

    public VCBConfigDto() {
    }

    public List<VCBConfigBusinessDto> getBusinessaccounts() {

        return businessaccounts;

    }

    public List<VCBConfigBusinessDto> getBusinesshouseholdaccounts() {

        return businesshouseholdaccounts;

    }

    public void setBusinessaccounts(List<VCBConfigBusinessDto> businessaccounts) {

        this.businessaccounts = businessaccounts;

    }

    public void setBusinesshouseholdaccounts(List<VCBConfigBusinessDto> businesshouseholdaccounts) {

        this.businesshouseholdaccounts = businesshouseholdaccounts;

    }
}
