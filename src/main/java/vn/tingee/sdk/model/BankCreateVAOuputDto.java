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
public class BankCreateVAOuputDto {
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @JsonProperty("merchantAccountNumberId")
    private Integer merchantAccountNumberId;
    @JsonProperty("shopId")
    private Integer shopId;
    @JsonProperty("status")
    private StatusMerchantAccountNumberEnum status;
    @JsonProperty("confirmId")
    private String confirmId;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("deepLink")
    private String deepLink;
    @JsonProperty("otpMethod")
    private OtpStbConfirmMethodEnum otpMethod;
    @JsonProperty("qrDto")
    private OneQRDto qrDto;

}
