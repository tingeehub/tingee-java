package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class VCBConfigDto {
    @JsonProperty("businessAccounts")
    private List<VCBConfigBusinessDto> businessAccounts;
    @JsonProperty("businessHouseholdAccounts")
    private List<VCBConfigBusinessDto> businessHouseholdAccounts;

}
