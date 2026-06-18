package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiNfcCommandDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("enableNfc")
    private Boolean enableNfc;
    @JsonProperty("playSound")
    private Boolean playSound;
    @lombok.NonNull
    @JsonProperty("nfcUrl")
    private String nfcUrl;
    @lombok.NonNull
    @JsonProperty("nfcPackageName")
    private String nfcPackageName;

    /** Use this constructor to set all required fields. */
    public OpenApiNfcCommandDto(String uuid, String nfcUrl, String nfcPackageName) {
        this.uuid = uuid;
        this.nfcUrl = nfcUrl;
        this.nfcPackageName = nfcPackageName;
    }
}
