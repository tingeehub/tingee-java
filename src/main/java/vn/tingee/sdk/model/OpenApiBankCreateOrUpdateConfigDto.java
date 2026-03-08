package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiBankCreateOrUpdateConfigDto {
    @JsonProperty("bidvConfigDto")
    private BIDVConfigDto bidvConfigDto;
    @JsonProperty("ctgConfigDto")
    private CTGConfigDto ctgConfigDto;
    @JsonProperty("acbConfigDto")
    private ACBConfigBusinessDto acbConfigDto;
    @lombok.NonNull
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("otpNumber")
    private String otpNumber;
    @JsonProperty("confirmId")
    private String confirmId;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @JsonProperty("merchantId")
    private Integer merchantId;

    /** Use this constructor to set all required fields. */
    public OpenApiBankCreateOrUpdateConfigDto(BankAccountTypeEnum accountType) {
        this.accountType = accountType;
    }
}
