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
public class IncomeInvoiceListItemDto {
    @JsonProperty("id")
    private Double id;
    @JsonProperty("invoiceCode")
    private String invoiceCode;
    @JsonProperty("fileHistoryId")
    private String fileHistoryId;
    @JsonProperty("invoiceNo")
    private String invoiceNo;
    @JsonProperty("invoicePattern")
    private String invoicePattern;
    @JsonProperty("invoiceSeries")
    private String invoiceSeries;
    @JsonProperty("sellerName")
    private String sellerName;
    @JsonProperty("sellerTaxCode")
    private String sellerTaxCode;
    @JsonProperty("totalBeforeTax")
    private Double totalBeforeTax;
    @JsonProperty("taxAmount")
    private Double taxAmount;
    @JsonProperty("totalAfterTax")
    private Double totalAfterTax;
    @JsonProperty("invoiceDate")
    private String invoiceDate;
    @JsonProperty("receivedDate")
    private String receivedDate;
    @JsonProperty("invoiceStatus")
    private Double invoiceStatus;
    @JsonProperty("approvalStatus")
    private Double approvalStatus;
    @JsonProperty("tctStatus")
    private Double tctStatus;
    @JsonProperty("invoiceType")
    private Double invoiceType;
    @JsonProperty("invoiceProperty")
    private Double invoiceProperty;
    @JsonProperty("importMethod")
    private Double importMethod;
    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("note")
    private Object note;

}
