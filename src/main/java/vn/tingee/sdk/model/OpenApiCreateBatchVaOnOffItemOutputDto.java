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
public class OpenApiCreateBatchVaOnOffItemOutputDto {
    @lombok.NonNull
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @lombok.NonNull
    @JsonProperty("qrData")
    private String qrData;

    /** Use this constructor to set all required fields. */
    public OpenApiCreateBatchVaOnOffItemOutputDto(String vaAccountNumber, String qrData) {
        this.vaAccountNumber = vaAccountNumber;
        this.qrData = qrData;
    }
}
