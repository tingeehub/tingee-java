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
public class OpenApiDeviceFeaturesDto {
    @lombok.NonNull
    @JsonProperty("readAmount")
    private Boolean readAmount;
    @lombok.NonNull
    @JsonProperty("showStaticQrCode")
    private Boolean showStaticQrCode;
    @lombok.NonNull
    @JsonProperty("showDynamicQrCode")
    private Boolean showDynamicQrCode;
    @lombok.NonNull
    @JsonProperty("printReceipt")
    private Boolean printReceipt;

    /** Use this constructor to set all required fields. */
    public OpenApiDeviceFeaturesDto(Boolean readAmount, Boolean showStaticQrCode, Boolean showDynamicQrCode, Boolean printReceipt) {
        this.readAmount = readAmount;
        this.showStaticQrCode = showStaticQrCode;
        this.showDynamicQrCode = showDynamicQrCode;
        this.printReceipt = printReceipt;
    }
}
