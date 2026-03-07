package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiReadPartnerSecurityCodeDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;
    @lombok.NonNull
    @JsonProperty("securityCode")
    private String securityCode;

    /** Use this constructor to set all required fields. */
    public OpenApiReadPartnerSecurityCodeDto(String uuid, String securityCode) {
        this.uuid = uuid;
        this.securityCode = securityCode;
    }
}
