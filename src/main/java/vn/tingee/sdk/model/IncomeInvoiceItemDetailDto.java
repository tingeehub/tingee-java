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
public class IncomeInvoiceItemDetailDto {
    @JsonProperty("id")
    private Double id;
    @JsonProperty("lineNumber")
    private Double lineNumber;
    @JsonProperty("itemName")
    private String itemName;
    @JsonProperty("unitName")
    private String unitName;
    @JsonProperty("quantity")
    private Double quantity;
    @JsonProperty("unitPrice")
    private Double unitPrice;
    @JsonProperty("totalBeforeTax")
    private Double totalBeforeTax;
    @JsonProperty("taxRate")
    private String taxRate;
    @JsonProperty("taxAmount")
    private Double taxAmount;
    @JsonProperty("itemType")
    private Double itemType;
    @JsonProperty("isPromotion")
    private Boolean isPromotion;

}
