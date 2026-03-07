package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiShowQRCodeDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @lombok.NonNull
    @JsonProperty("amount")
    private Long amount;
    @lombok.NonNull
    @JsonProperty("qrCode")
    private String qrCode;
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;
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
    @JsonProperty("isStaticQr")
    private Boolean isStaticQr;
    @JsonProperty("playSound")
    private Boolean playSound;

    /** Use this constructor to set all required fields. */
    public OpenApiShowQRCodeDto(String uuid, Long amount, String qrCode) {
        this.uuid = uuid;
        this.amount = amount;
        this.qrCode = qrCode;
    }
}
