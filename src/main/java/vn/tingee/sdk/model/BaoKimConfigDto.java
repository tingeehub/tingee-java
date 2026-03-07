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
public class BaoKimConfigDto {
    @lombok.NonNull
    @JsonProperty("mid")
    private String mid;

    /** Use this constructor to set all required fields. */
    public BaoKimConfigDto(String mid) {
        this.mid = mid;
    }
}
