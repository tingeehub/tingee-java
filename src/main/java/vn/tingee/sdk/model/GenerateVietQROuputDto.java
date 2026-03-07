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
public class GenerateVietQROuputDto {
    @JsonProperty("qrCode")
    private String qrCode;
    @JsonProperty("qrCodeImage")
    private String qrCodeImage;
    @JsonProperty("qrAccount")
    private String qrAccount;
    @JsonProperty("referenceLabelCode")
    private String referenceLabelCode;

}
