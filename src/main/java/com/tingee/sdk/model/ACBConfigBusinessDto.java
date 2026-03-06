package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class ACBConfigBusinessDto {
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("accountName")
    private String accountName;
    @lombok.NonNull
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @lombok.NonNull
    @JsonProperty("mobile")
    private String mobile;
    @lombok.NonNull
    @JsonProperty("acbUserId")
    private String acbUserId;

    /** Use this constructor to set all required fields. */
    public ACBConfigBusinessDto(String accountNumber, String accountName, String vaPrefix, String mobile, String acbUserId) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.vaPrefix = vaPrefix;
        this.mobile = mobile;
        this.acbUserId = acbUserId;
    }
}
