package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class VPBConfigDto {
    @JsonProperty("businessAccounts")
    private List<VPBConfigBusinessDto> businessAccounts;
    @JsonProperty("businessHouseholdAccounts")
    private List<VPBConfigBusinessDto> businessHouseholdAccounts;

}
