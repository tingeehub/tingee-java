package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class TaxRateSummaryDto {
    @lombok.NonNull
    @JsonProperty("taxRateCode")
    private String taxRateCode;
    @JsonProperty("totalTaxableAmount")
    private Long totalTaxableAmount;
    @JsonProperty("taxAmount")
    private Long taxAmount;

    /** Use this constructor to set all required fields. */
    public TaxRateSummaryDto(String taxRateCode) {
        this.taxRateCode = taxRateCode;
    }
}
