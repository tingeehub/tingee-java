package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class EventUrlItemDto {
    @lombok.NonNull
    @JsonProperty("url")
    private String url;
    @lombok.NonNull
    @JsonProperty("type")
    private EventUrlItemType type;
    @JsonProperty("ids")
    private List<String> ids;

    /** Use this constructor to set all required fields. */
    public EventUrlItemDto(String url, EventUrlItemType type) {
        this.url = url;
        this.type = type;
    }
}
