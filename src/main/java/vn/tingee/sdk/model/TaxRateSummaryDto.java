package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxRateSummaryDto {
    @lombok.NonNull
    @JsonProperty("taxRateCode")
    private String taxRateCode;
    @JsonProperty("totalTaxableAmount")
    private String totalTaxableAmount;
    @JsonProperty("taxAmount")
    private String taxAmount;

    /** Use this constructor to set all required fields. */
    public TaxRateSummaryDto(String taxRateCode) {
        this.taxRateCode = taxRateCode;
    }
}
