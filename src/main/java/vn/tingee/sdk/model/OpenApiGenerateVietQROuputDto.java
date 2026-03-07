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
public class OpenApiGenerateVietQROuputDto {
    @lombok.NonNull
    @JsonProperty("bankBin")
    private String bankBin;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("purpose")
    private String purpose;
    @lombok.NonNull
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @lombok.NonNull
    @JsonProperty("vaSuffix")
    private String vaSuffix;

    /** Use this constructor to set all required fields. */
    public OpenApiGenerateVietQROuputDto(String bankBin, String accountNumber, String vaPrefix, String vaSuffix) {
        this.bankBin = bankBin;
        this.accountNumber = accountNumber;
        this.vaPrefix = vaPrefix;
        this.vaSuffix = vaSuffix;
    }
}
