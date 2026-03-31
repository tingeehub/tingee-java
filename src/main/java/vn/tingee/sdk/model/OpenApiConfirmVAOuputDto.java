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
public class OpenApiConfirmVAOuputDto {
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("shopId")
    private Integer shopId;

}
