package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiGenerateAndShowDynamicQrCodeDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @lombok.NonNull
    @JsonProperty("qrCodeType")
    private QRCodeTypeEnum qrCodeType;
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @lombok.NonNull
    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("purpose")
    private String purpose;
    @lombok.NonNull
    @JsonProperty("expireInMinute")
    private Integer expireInMinute;
    @JsonProperty("extraInfo")
    private String extraInfo;
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("deviceType")
    private DeviceTypeEnum deviceType;
    @JsonProperty("firstText")
    private String firstText;
    @JsonProperty("secondText")
    private String secondText;
    @JsonProperty("thirdText")
    private String thirdText;
    @JsonProperty("showTime")
    private Integer showTime;
    @JsonProperty("playSound")
    private Boolean playSound;
    @JsonProperty("readAmountAfterPay")
    private Boolean readAmountAfterPay;

    /** Use this constructor to set all required fields. */
    public OpenApiGenerateAndShowDynamicQrCodeDto(String vaAccountNumber, QRCodeTypeEnum qrCodeType, Long amount, Integer expireInMinute, String uuid) {
        this.vaAccountNumber = vaAccountNumber;
        this.qrCodeType = qrCodeType;
        this.amount = amount;
        this.expireInMinute = expireInMinute;
        this.uuid = uuid;
    }
}
