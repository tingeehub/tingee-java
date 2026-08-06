package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiOffVADto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("billId")
    private String billId;
    @lombok.NonNull
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;

    /** Use this constructor to set all required fields. */
    public OpenApiOffVADto(String billId, String vaAccountNumber) {
        this.billId = billId;
        this.vaAccountNumber = vaAccountNumber;
    }
}
