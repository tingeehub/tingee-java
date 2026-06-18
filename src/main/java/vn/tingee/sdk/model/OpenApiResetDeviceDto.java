package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiResetDeviceDto {
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("isBankRequest")
    private Boolean isBankRequest;

    /** Use this constructor to set all required fields. */
    public OpenApiResetDeviceDto(String uuid) {
        this.uuid = uuid;
    }
}
