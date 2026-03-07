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
public class GenerateDynamicQROuputDto {
    @JsonProperty("qrCode")
    private String qrCode;
    @JsonProperty("qrAccount")
    private String qrAccount;
    @JsonProperty("billId")
    private String billId;

}
