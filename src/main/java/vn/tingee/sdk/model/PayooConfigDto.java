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
public class PayooConfigDto {
    @lombok.NonNull
    @JsonProperty("accountName")
    private String accountName;

    /** Use this constructor to set all required fields. */
    public PayooConfigDto(String accountName) {
        this.accountName = accountName;
    }
}
