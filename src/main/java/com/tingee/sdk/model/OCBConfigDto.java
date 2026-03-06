package com.tingee.sdk.model;

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
public class OCBConfigDto {
    @lombok.NonNull
    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("clientSecret")
    private String clientSecret;
    @JsonProperty("pathCertKey")
    private FileUploadDto pathCertKey;
    @JsonProperty("pathPrivateKey")
    private FileUploadDto pathPrivateKey;
    @lombok.NonNull
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @JsonProperty("vaPrefixForDynamicQR")
    private String vaPrefixForDynamicQR;
    @JsonProperty("accountNumbers")
    private List<String> accountNumbers;

    /** Use this constructor to set all required fields. */
    public OCBConfigDto(String clientId, String userName) {
        this.clientId = clientId;
        this.userName = userName;
    }
}
