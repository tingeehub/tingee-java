package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiDeepLinkDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("type")
    private String type;
    @lombok.NonNull
    @JsonProperty("qrCode")
    private String qrCode;
    @lombok.NonNull
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    @lombok.NonNull
    @JsonProperty("callbackUrl")
    private String callbackUrl;
    @lombok.NonNull
    @JsonProperty("bankBin")
    private String bankBin;
    @lombok.NonNull
    @JsonProperty("destinationBankBin")
    private String destinationBankBin;
    @lombok.NonNull
    @JsonProperty("accountName")
    private String accountName;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("content")
    private String content;
    @lombok.NonNull
    @JsonProperty("billNumber")
    private String billNumber;

    /** Use this constructor to set all required fields. */
    public OpenApiDeepLinkDto(String type, String qrCode, String redirectUrl, String callbackUrl, String bankBin, String destinationBankBin, String accountName, String accountNumber, String billNumber) {
        this.type = type;
        this.qrCode = qrCode;
        this.redirectUrl = redirectUrl;
        this.callbackUrl = callbackUrl;
        this.bankBin = bankBin;
        this.destinationBankBin = destinationBankBin;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.billNumber = billNumber;
    }
}
