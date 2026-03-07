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
public class ShinhanConfigDto {
    @lombok.NonNull
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @lombok.NonNull
    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("clientSecret")
    private String clientSecret;
    @JsonProperty("pathPublicKey")
    private FileUploadDto pathPublicKey;
    @JsonProperty("pathPrivateKey")
    private FileUploadDto pathPrivateKey;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("accountName")
    private String accountName;

    /** Use this constructor to set all required fields. */
    public ShinhanConfigDto(String vaPrefix, String clientId, String accountNumber, String accountName) {
        this.vaPrefix = vaPrefix;
        this.clientId = clientId;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }
}
