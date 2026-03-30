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
public class DownloadInvoiceOutputDto {
    @lombok.NonNull
    @JsonProperty("invoiceCode")
    private String invoiceCode;
    @lombok.NonNull
    @JsonProperty("pdfBase64")
    private String pdfBase64;

    /** Use this constructor to set all required fields. */
    public DownloadInvoiceOutputDto(String invoiceCode, String pdfBase64) {
        this.invoiceCode = invoiceCode;
        this.pdfBase64 = pdfBase64;
    }
}
