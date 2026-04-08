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
public class InvoiceItemDto {
    @JsonProperty("itemCode")
    private String itemCode;
    @lombok.NonNull
    @JsonProperty("itemName")
    private String itemName;
    @JsonProperty("unitName")
    private String unitName;
    @lombok.NonNull
    @JsonProperty("quantity")
    private String quantity;
    @lombok.NonNull
    @JsonProperty("unitPrice")
    private String unitPrice;
    @JsonProperty("discount")
    private String discount;
    @JsonProperty("discountAmount")
    private String discountAmount;
    @JsonProperty("totalBeforeTax")
    private String totalBeforeTax;
    @lombok.NonNull
    @JsonProperty("taxRateCode")
    private String taxRateCode;
    @JsonProperty("taxAmount")
    private String taxAmount;
    @JsonProperty("totalAfterTax")
    private String totalAfterTax;
    @JsonProperty("itemType")
    private Integer itemType;
    @JsonProperty("adjustmentType")
    private Integer adjustmentType;

    /** Use this constructor to set all required fields. */
    public InvoiceItemDto(String itemName, String quantity, String unitPrice, String taxRateCode) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.taxRateCode = taxRateCode;
    }
}
