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
public class OpenApiVerifyReferralCodeResponseDto {
    @lombok.NonNull
    @JsonProperty("isValid")
    private Boolean isValid;
    @JsonProperty("canConnectAllBanks")
    private Boolean canConnectAllBanks;
    @JsonProperty("bankBins")
    private List<String> bankBins;

    /** Use this constructor to set all required fields. */
    public OpenApiVerifyReferralCodeResponseDto(Boolean isValid) {
        this.isValid = isValid;
    }
}
