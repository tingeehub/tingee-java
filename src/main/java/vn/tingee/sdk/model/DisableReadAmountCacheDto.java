package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class DisableReadAmountCacheDto {
    @lombok.NonNull
    @JsonProperty("uuids")
    private List<String> uuids;

    /** Use this constructor to set all required fields. */
    public DisableReadAmountCacheDto(List<String> uuids) {
        this.uuids = uuids;
    }
}
