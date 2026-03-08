package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiConfigAccountBusinessDto {
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("accountName")
    private String accountName;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("acbUserId")
    private String acbUserId;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;

    /** Use this constructor to set all required fields. */
    public OpenApiConfigAccountBusinessDto(String acbUserId) {
        this.acbUserId = acbUserId;
    }
}
