package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiClearDeviceScreenDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;

    /** Use this constructor to set all required fields. */
    public OpenApiClearDeviceScreenDto(String uuid) {
        this.uuid = uuid;
    }
}
