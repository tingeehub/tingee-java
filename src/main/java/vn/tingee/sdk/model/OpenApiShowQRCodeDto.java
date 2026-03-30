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
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @lombok.NonNull
    @JsonProperty("amount")
    private Long amount;
    @lombok.NonNull
    @JsonProperty("qrCode")
    private String qrCode;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;
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
    @JsonProperty("isStaticQr")
    private Boolean isStaticQr;
    @JsonProperty("playSound")
    private Boolean playSound;

    /** Use this constructor to set all required fields. */
    public OpenApiShowQRCodeDto(Long amount, String qrCode, String uuid) {
        this.amount = amount;
        this.qrCode = qrCode;
        this.uuid = uuid;
    }
}
