package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiGenerateVietQRInputDto {
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("content")
    private String content;

    /** Use this constructor to set all required fields. */
    public OpenApiGenerateVietQRInputDto(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
