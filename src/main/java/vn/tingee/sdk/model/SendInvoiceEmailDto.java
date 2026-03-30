package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class SendInvoiceEmailDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("provider")
    private EInvoiceProviderEnum provider;
    @JsonProperty("taxCode")
    private String taxCode;
    @lombok.NonNull
    @JsonProperty("invoiceCode")
    private String invoiceCode;
    @lombok.NonNull
    @JsonProperty("recipientEmail")
    private String recipientEmail;

    /** Use this constructor to set all required fields. */
    public SendInvoiceEmailDto(String invoiceCode, String recipientEmail) {
        this.invoiceCode = invoiceCode;
        this.recipientEmail = recipientEmail;
    }
}
