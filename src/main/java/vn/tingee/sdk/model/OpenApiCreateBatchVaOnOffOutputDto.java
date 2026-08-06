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
public class OpenApiCreateBatchVaOnOffOutputDto {
    @lombok.NonNull
    @JsonProperty("shopId")
    private Double shopId;
    @lombok.NonNull
    @JsonProperty("qrArray")
    private List<OpenApiCreateBatchVaOnOffItemOutputDto> qrArray;

    /** Use this constructor to set all required fields. */
    public OpenApiCreateBatchVaOnOffOutputDto(Double shopId, List<OpenApiCreateBatchVaOnOffItemOutputDto> qrArray) {
        this.shopId = shopId;
        this.qrArray = qrArray;
    }
}
