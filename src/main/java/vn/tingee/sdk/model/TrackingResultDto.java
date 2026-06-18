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
public class TrackingResultDto {
    @lombok.NonNull
    @JsonProperty("invoiceCode")
    private String invoiceCode;
    @JsonProperty("trackingCode")
    private String trackingCode;
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;
    @JsonProperty("reservationCode")
    private String reservationCode;
    @JsonProperty("codeOfTax")
    private String codeOfTax;
    @JsonProperty("url")
    private String url;

    /** Use this constructor to set all required fields. */
    public TrackingResultDto(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }
}
