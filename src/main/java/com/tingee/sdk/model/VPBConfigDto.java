package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class VPBConfigDto {
    @JsonProperty("businessAccounts")
    private List<VPBConfigBusinessDto> businessaccounts;
    @JsonProperty("businessHouseholdAccounts")
    private List<VPBConfigBusinessDto> businesshouseholdaccounts;

    public VPBConfigDto() {
    }

    public List<VPBConfigBusinessDto> getBusinessaccounts() {

        return businessaccounts;

    }

    public List<VPBConfigBusinessDto> getBusinesshouseholdaccounts() {

        return businesshouseholdaccounts;

    }

    public void setBusinessaccounts(List<VPBConfigBusinessDto> businessaccounts) {

        this.businessaccounts = businessaccounts;

    }

    public void setBusinesshouseholdaccounts(List<VPBConfigBusinessDto> businesshouseholdaccounts) {

        this.businesshouseholdaccounts = businesshouseholdaccounts;

    }
}
