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
public class SendNotifyZaloDto {
    @lombok.NonNull
    @JsonProperty("type")
    private ZaloTypeEnum type;
    @lombok.NonNull
    @JsonProperty("name")
    private String name;

    /** Use this constructor to set all required fields. */
    public SendNotifyZaloDto(ZaloTypeEnum type, String name) {
        this.type = type;
        this.name = name;
    }
}
