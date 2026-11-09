package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiGetDeviceFeaturesDto {
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;

    /** Use this constructor to set all required fields. */
    public OpenApiGetDeviceFeaturesDto(String uuid) {
        this.uuid = uuid;
    }
}
