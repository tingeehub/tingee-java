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
public class OpenApiMerchantIdDto {
    @lombok.NonNull
    @JsonProperty("merchantId")
    private Long merchantId;

    /** Use this constructor to set all required fields. */
    public OpenApiMerchantIdDto(Long merchantId) {
        this.merchantId = merchantId;
    }
}
