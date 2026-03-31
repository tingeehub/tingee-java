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
public class PaymentBillResponseDto {
    @JsonProperty("code")
    private String code;
    @JsonProperty("status")
    private DirectDebitTransactionStatusEnum status;
    @JsonProperty("transactionCode")
    private String transactionCode;
    @JsonProperty("isSentConfirmEmail")
    private Boolean isSentConfirmEmail;
    @JsonProperty("isSentConfirmZalo")
    private Boolean isSentConfirmZalo;
    @JsonProperty("returnUrl")
    private String returnUrl;

}
