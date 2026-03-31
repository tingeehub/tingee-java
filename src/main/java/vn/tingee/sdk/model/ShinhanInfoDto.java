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
public class ShinhanInfoDto {
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("merchantName")
    private String merchantName;

}
