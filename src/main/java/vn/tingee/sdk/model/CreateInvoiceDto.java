package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class CreateInvoiceDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("accountId")
    private Integer accountId;
    @JsonProperty("invoiceType")
    private String invoiceType;
    @lombok.NonNull
    @JsonProperty("invoicePattern")
    private String invoicePattern;
    @lombok.NonNull
    @JsonProperty("invoiceSeries")
    private String invoiceSeries;
    @lombok.NonNull
    @JsonProperty("invoiceCode")
    private String invoiceCode;
    @lombok.NonNull
    @JsonProperty("invoiceDate")
    private LocalDateTime invoiceDate;
    @JsonProperty("buyerTaxCode")
    private String buyerTaxCode;
    @JsonProperty("buyerIdentity")
    private String buyerIdentity;
    @JsonProperty("buyerIdType")
    private String buyerIdType;
    @JsonProperty("buyerName")
    private String buyerName;
    @JsonProperty("buyerLegalName")
    private String buyerLegalName;
    @JsonProperty("buyerAddress")
    private String buyerAddress;
    @JsonProperty("buyerPhone")
    private String buyerPhone;
    @JsonProperty("buyerEmail")
    private String buyerEmail;
    @JsonProperty("buyerBankAccount")
    private String buyerBankAccount;
    @JsonProperty("buyerBankName")
    private String buyerBankName;
    @JsonProperty("paymentMethod")
    private Integer paymentMethod;
    @JsonProperty("paymentMethodName")
    private String paymentMethodName;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("exchangeRate")
    private String exchangeRate;
    @JsonProperty("amountInWords")
    private String amountInWords;
    @JsonProperty("note")
    private String note;
    @lombok.NonNull
    @JsonProperty("items")
    private List<InvoiceItemDto> items;
    @JsonProperty("totalDiscount")
    private String totalDiscount;
    @JsonProperty("totalBeforeTax")
    private String totalBeforeTax;
    @JsonProperty("totalTax")
    private String totalTax;
    @JsonProperty("totalAfterTax")
    private String totalAfterTax;
    @JsonProperty("taxRateSummaries")
    private List<TaxRateSummaryDto> taxRateSummaries;

    /** Use this constructor to set all required fields. */
    public CreateInvoiceDto(String invoicePattern, String invoiceSeries, String invoiceCode, LocalDateTime invoiceDate, List<InvoiceItemDto> items) {
        this.invoicePattern = invoicePattern;
        this.invoiceSeries = invoiceSeries;
        this.invoiceCode = invoiceCode;
        this.invoiceDate = invoiceDate;
        this.items = items;
    }
}
