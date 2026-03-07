package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class SendNotifyTingeeBoxDto {
    @lombok.NonNull
    @JsonProperty("type")
    private DeviceTypeEnum type;
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;

    /** Use this constructor to set all required fields. */
    public SendNotifyTingeeBoxDto(DeviceTypeEnum type, String uuid) {
        this.type = type;
        this.uuid = uuid;
    }
}
