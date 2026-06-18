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
public class OpenApiPrintReceiptItemDto {
    @lombok.NonNull
    @JsonProperty("name")
    private String name;
    @lombok.NonNull
    @JsonProperty("quantity")
    private Integer quantity;
    @lombok.NonNull
    @JsonProperty("unitPrice")
    private Long unitPrice;

    /** Use this constructor to set all required fields. */
    public OpenApiPrintReceiptItemDto(String name, Integer quantity, Long unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
}
