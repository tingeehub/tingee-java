package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiDeleteConfigBusinessDto {
    @lombok.NonNull
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @lombok.NonNull
    @JsonProperty("configRemove")
    private ACBConfigBusinessDto configRemove;
    @JsonProperty("merchantId")
    private Integer merchantId;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;

    /** Use this constructor to set all required fields. */
    public OpenApiDeleteConfigBusinessDto(BankAccountTypeEnum accountType, ACBConfigBusinessDto configRemove) {
        this.accountType = accountType;
        this.configRemove = configRemove;
    }
}
