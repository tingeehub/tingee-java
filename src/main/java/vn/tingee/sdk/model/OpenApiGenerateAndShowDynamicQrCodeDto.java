package vn.tingee.sdk.model;

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
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("purpose")
    private String purpose;
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
    public OpenApiGenerateAndShowDynamicQrCodeDto(String vaAccountNumber, QRCodeTypeEnum qrCodeType, String uuid) {
        this.vaAccountNumber = vaAccountNumber;
        this.qrCodeType = qrCodeType;
        this.uuid = uuid;
    }
}
