package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class ACBConfigDto {
    @JsonProperty("businessAccounts")
    private List<ACBConfigBusinessDto> businessaccounts;
    @JsonProperty("businessHouseholdAccounts")
    private List<ACBConfigBusinessDto> businesshouseholdaccounts;

    public ACBConfigDto() {
    }

    public List<ACBConfigBusinessDto> getBusinessaccounts() {

        return businessaccounts;

    }

    public List<ACBConfigBusinessDto> getBusinesshouseholdaccounts() {

        return businesshouseholdaccounts;

    }

    public void setBusinessaccounts(List<ACBConfigBusinessDto> businessaccounts) {

        this.businessaccounts = businessaccounts;

    }

    public void setBusinesshouseholdaccounts(List<ACBConfigBusinessDto> businesshouseholdaccounts) {

        this.businesshouseholdaccounts = businesshouseholdaccounts;

    }
}
