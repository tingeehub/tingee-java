package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class InvoiceTemplateQueryDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("provider")
    private EInvoiceProviderEnum provider;
    @JsonProperty("taxCode")
    private String taxCode;
    @lombok.NonNull
    @JsonProperty("invoiceNoToCheck")
    private Integer invoiceNoToCheck;

    /** Use this constructor to set all required fields. */
    public InvoiceTemplateQueryDto(Integer invoiceNoToCheck) {
        this.invoiceNoToCheck = invoiceNoToCheck;
    }
}
