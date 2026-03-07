package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiRegisterDto {
    @lombok.NonNull
    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("accountName")
    private String accountName;
    @lombok.NonNull
    @JsonProperty("phone")
    private String phone;
    @lombok.NonNull
    @JsonProperty("returnUrl")
    private String returnUrl;

    /** Use this constructor to set all required fields. */
    public OpenApiRegisterDto(String requestId, String phone, String returnUrl) {
        this.requestId = requestId;
        this.phone = phone;
        this.returnUrl = returnUrl;
    }
}
