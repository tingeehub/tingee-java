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
public class IncomeInvoiceDetailOutputDto {
    @JsonProperty("invoiceCode")
    private String invoiceCode;
    @JsonProperty("fileHistoryId")
    private String fileHistoryId;
    @JsonProperty("invoiceName")
    private String invoiceName;
    @JsonProperty("invoicePattern")
    private String invoicePattern;
    @JsonProperty("invoiceSeries")
    private String invoiceSeries;
    @JsonProperty("invoiceNo")
    private String invoiceNo;
    @JsonProperty("invoiceDate")
    private String invoiceDate;
    @JsonProperty("approvedDate")
    private String approvedDate;
    @JsonProperty("receivedDate")
    private String receivedDate;
    @JsonProperty("paymentDate")
    private String paymentDate;
    @JsonProperty("signedDate")
    private String signedDate;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("exchangeRate")
    private Double exchangeRate;
    @JsonProperty("paymentMethod")
    private String paymentMethod;
    @JsonProperty("sellerName")
    private String sellerName;
    @JsonProperty("sellerTaxCode")
    private String sellerTaxCode;
    @JsonProperty("sellerAddress")
    private String sellerAddress;
    @JsonProperty("buyerName")
    private String buyerName;
    @JsonProperty("buyerTaxCode")
    private String buyerTaxCode;
    @JsonProperty("buyerAddress")
    private String buyerAddress;
    @JsonProperty("totalBeforeTax")
    private Double totalBeforeTax;
    @JsonProperty("taxAmount")
    private Double taxAmount;
    @JsonProperty("discountAmount")
    private Double discountAmount;
    @JsonProperty("totalAfterTax")
    private Double totalAfterTax;
    @JsonProperty("amountInWords")
    private String amountInWords;
    @JsonProperty("invoiceStatus")
    private Double invoiceStatus;
    @JsonProperty("approvalStatus")
    private Double approvalStatus;
    @JsonProperty("invoiceType")
    private Double invoiceType;
    @JsonProperty("note")
    private String note;
    @lombok.NonNull
    @JsonProperty("items")
    private List<IncomeInvoiceItemDetailDto> items;
    @lombok.NonNull
    @JsonProperty("taxRateSummaries")
    private List<IncomeInvoiceTaxRateSummaryDto> taxRateSummaries;

    /** Use this constructor to set all required fields. */
    public IncomeInvoiceDetailOutputDto(List<IncomeInvoiceItemDetailDto> items, List<IncomeInvoiceTaxRateSummaryDto> taxRateSummaries) {
        this.items = items;
        this.taxRateSummaries = taxRateSummaries;
    }
}
