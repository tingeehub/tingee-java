package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiCreateBatchVaOnOffInputDto {
    @JsonProperty("masterMerchantId")
    private Double masterMerchantId;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @lombok.NonNull
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @JsonProperty("merchantName")
    private String merchantName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("shopId")
    private Double shopId;
    @lombok.NonNull
    @JsonProperty("vaAccountNumbers")
    private List<String> vaAccountNumbers;
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("purpose")
    private String purpose;

    /** Use this constructor to set all required fields. */
    public OpenApiCreateBatchVaOnOffInputDto(BankAccountTypeEnum accountType, List<String> vaAccountNumbers) {
        this.accountType = accountType;
        this.vaAccountNumbers = vaAccountNumbers;
    }
}
