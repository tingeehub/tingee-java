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
    @JsonProperty("accountId")
    private Integer accountId;
    @lombok.NonNull
    @JsonProperty("invoiceCode")
    private String invoiceCode;

    /** Use this constructor to set all required fields. */
    public DownloadInvoiceQueryDto(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }
}
