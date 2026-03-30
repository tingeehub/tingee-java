package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class DownloadInvoiceQueryDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("provider")
    private EInvoiceProviderEnum provider;
    @JsonProperty("taxCode")
    private String taxCode;
    @lombok.NonNull
    @JsonProperty("invoicePattern")
    private String invoicePattern;
    @lombok.NonNull
    @JsonProperty("invoiceSeries")
    private String invoiceSeries;
    @lombok.NonNull
    @JsonProperty("invoiceCode")
    private String invoiceCode;

    /** Use this constructor to set all required fields. */
    public DownloadInvoiceQueryDto(String invoicePattern, String invoiceSeries, String invoiceCode) {
        this.invoicePattern = invoicePattern;
        this.invoiceSeries = invoiceSeries;
        this.invoiceCode = invoiceCode;
    }
}
