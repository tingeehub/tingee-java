package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaoKimConfigDto {
    @JsonProperty("mid")
    private String mid;
    @JsonProperty("accountName")
    private String accountName;
    @JsonProperty("walletId")
    private String walletId;
    @JsonProperty("privateKey")
    private String privateKey;

}
