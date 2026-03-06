package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class V2AccountNumberDDLDto {
    @lombok.NonNull
    @JsonProperty("id")
    private Integer id;
    @lombok.NonNull
    @JsonProperty("name")
    private String name;
    @lombok.NonNull
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("bankBin")
    private String bankBin;
    @lombok.NonNull
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("realVANumber")
    private String realVANumber;
    @JsonProperty("bankInfoDto")
    private BankInfoDto bankInfoDto;
    @lombok.NonNull
    @JsonProperty("shopId")
    private Integer shopId;
    @lombok.NonNull
    @JsonProperty("shopName")
    private String shopName;

    /** Use this constructor to set all required fields. */
    public V2AccountNumberDDLDto(Integer id, String name, Integer merchantId, String bankBin, BankNameEnum bankName, String accountNumber, Integer shopId, String shopName) {
        this.id = id;
        this.name = name;
        this.merchantId = merchantId;
        this.bankBin = bankBin;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.shopId = shopId;
        this.shopName = shopName;
    }
}
