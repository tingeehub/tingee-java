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
public class ACBConfigDto {
    @JsonProperty("businessAccounts")
    private List<ACBConfigBusinessDto> businessAccounts;
    @JsonProperty("businessHouseholdAccounts")
    private List<ACBConfigBusinessDto> businessHouseholdAccounts;

}
