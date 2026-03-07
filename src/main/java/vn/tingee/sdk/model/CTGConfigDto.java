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
public class CTGConfigDto {
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("accountName")
    private String accountName;
    @lombok.NonNull
    @JsonProperty("vaPrefix")
    private String vaPrefix;

    /** Use this constructor to set all required fields. */
    public CTGConfigDto(String accountNumber, String accountName, String vaPrefix) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.vaPrefix = vaPrefix;
    }
}
