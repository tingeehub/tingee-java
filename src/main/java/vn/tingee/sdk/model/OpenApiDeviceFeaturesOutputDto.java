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
public class OpenApiDeviceFeaturesOutputDto {
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;
    @lombok.NonNull
    @JsonProperty("type")
    private DeviceTypeEnum type;
    @lombok.NonNull
    @JsonProperty("features")
    private OpenApiDeviceFeaturesDto features;

    /** Use this constructor to set all required fields. */
    public OpenApiDeviceFeaturesOutputDto(String uuid, DeviceTypeEnum type, OpenApiDeviceFeaturesDto features) {
        this.uuid = uuid;
        this.type = type;
        this.features = features;
    }
}
