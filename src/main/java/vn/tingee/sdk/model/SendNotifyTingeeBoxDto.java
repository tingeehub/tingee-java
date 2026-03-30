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
    @JsonProperty("type")
    private DeviceTypeEnum type;
    @JsonProperty("uuid")
    private String uuid;

}
