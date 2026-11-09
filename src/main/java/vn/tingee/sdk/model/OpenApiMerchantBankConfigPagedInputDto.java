package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiMerchantBankConfigPagedInputDto {
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("sorting")
    private String sorting;
    @JsonProperty("skipCount")
    private Integer skipCount;
    @JsonProperty("maxResultCount")
    private Integer maxResultCount;
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @JsonProperty("merchantId")
    private Integer merchantId;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;

}
