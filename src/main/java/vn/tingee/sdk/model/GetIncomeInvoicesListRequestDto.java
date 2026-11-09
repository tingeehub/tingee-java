package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class GetIncomeInvoicesListRequestDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("accountId")
    private Integer accountId;
    @JsonProperty("sellerTaxCode")
    private String sellerTaxCode;
    @JsonProperty("buyerTaxCode")
    private String buyerTaxCode;
    @JsonProperty("current")
    private Double current;
    @JsonProperty("approvedFromDate")
    private String approvedFromDate;
    @JsonProperty("approvedToDate")
    private String approvedToDate;
    @JsonProperty("invoiceFromDate")
    private String invoiceFromDate;
    @JsonProperty("invoiceToDate")
    private String invoiceToDate;
    @JsonProperty("receivedFromDate")
    private String receivedFromDate;
    @JsonProperty("receivedToDate")
    private String receivedToDate;
    @JsonProperty("label")
    private String label;
    @JsonProperty("page")
    private Double page;
    @JsonProperty("pageSize")
    private Double pageSize;
    @JsonProperty("size")
    private Double size;
    @JsonProperty("invoiceNo")
    private String invoiceNo;
    @JsonProperty("invoiceProperty")
    private Double invoiceProperty;
    @JsonProperty("approvalStatus")
    private Double approvalStatus;

}
