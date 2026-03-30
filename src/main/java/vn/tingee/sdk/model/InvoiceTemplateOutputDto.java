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
public class InvoiceTemplateOutputDto {
    @lombok.NonNull
    @JsonProperty("invoicePattern")
    private String invoicePattern;
    @lombok.NonNull
    @JsonProperty("invoiceSeries")
    private String invoiceSeries;
    @JsonProperty("quota")
    private Integer quota;

    /** Use this constructor to set all required fields. */
    public InvoiceTemplateOutputDto(String invoicePattern, String invoiceSeries) {
        this.invoicePattern = invoicePattern;
        this.invoiceSeries = invoiceSeries;
    }
}
