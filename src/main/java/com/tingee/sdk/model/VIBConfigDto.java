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
public class VIBConfigDto {
    @lombok.NonNull
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @JsonProperty("pathPublicKey")
    private FileUploadDto pathPublicKey;
    @JsonProperty("pathPrivateKey")
    private FileUploadDto pathPrivateKey;
    @lombok.NonNull
    @JsonProperty("basicAuthToken")
    private String basicAuthToken;
    @lombok.NonNull
    @JsonProperty("cif")
    private String cif;
    @lombok.NonNull
    @JsonProperty("clientId")
    private String clientId;
    @lombok.NonNull
    @JsonProperty("clientSecret")
    private String clientSecret;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("vaCharactersNumber")
    private Integer vaCharactersNumber;

    /** Use this constructor to set all required fields. */
    public VIBConfigDto(String vaPrefix, String basicAuthToken, String cif, String clientId, String clientSecret, String accountNumber, Integer vaCharactersNumber) {
        this.vaPrefix = vaPrefix;
        this.basicAuthToken = basicAuthToken;
        this.cif = cif;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.accountNumber = accountNumber;
        this.vaCharactersNumber = vaCharactersNumber;
    }
}
