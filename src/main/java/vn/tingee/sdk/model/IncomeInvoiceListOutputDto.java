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
public class IncomeInvoiceListOutputDto {
    @lombok.NonNull
    @JsonProperty("items")
    private List<IncomeInvoiceListItemDto> items;
    @lombok.NonNull
    @JsonProperty("totalCount")
    private Double totalCount;

    /** Use this constructor to set all required fields. */
    public IncomeInvoiceListOutputDto(List<IncomeInvoiceListItemDto> items, Double totalCount) {
        this.items = items;
        this.totalCount = totalCount;
    }
}
