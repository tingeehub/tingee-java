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
    private Integer quantity;
    @lombok.NonNull
    @JsonProperty("unitPrice")
    private Integer unitPrice;
    @JsonProperty("discount")
    private Double discount;
    @JsonProperty("discountAmount")
    private Long discountAmount;
    @JsonProperty("totalBeforeTax")
    private Long totalBeforeTax;
    @lombok.NonNull
    @JsonProperty("taxRateCode")
    private String taxRateCode;
    @JsonProperty("taxAmount")
    private Long taxAmount;
    @JsonProperty("totalAfterTax")
    private Long totalAfterTax;
    @JsonProperty("itemType")
    private Integer itemType;
    @JsonProperty("adjustmentType")
    private Integer adjustmentType;

    /** Use this constructor to set all required fields. */
    public InvoiceItemDto(String itemName, Integer quantity, Integer unitPrice, String taxRateCode) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.taxRateCode = taxRateCode;
    }
}
