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
public class MBBConfigDto {
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("accountName")
    private String accountName;
    @lombok.NonNull
    @JsonProperty("identity")
    private String identity;
    @lombok.NonNull
    @JsonProperty("mobile")
    private String mobile;

    /** Use this constructor to set all required fields. */
    public MBBConfigDto(String accountNumber, String accountName, String identity, String mobile) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.identity = identity;
        this.mobile = mobile;
    }
}
