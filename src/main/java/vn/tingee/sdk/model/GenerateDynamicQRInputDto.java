package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class GenerateDynamicQRInputDto {
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

    /** Use this constructor to set all required fields. */
    public GenerateDynamicQRInputDto(String vaAccountNumber, QRCodeTypeEnum qrCodeType, Long amount, Integer expireInMinute) {
        this.vaAccountNumber = vaAccountNumber;
        this.qrCodeType = qrCodeType;
        this.amount = amount;
        this.expireInMinute = expireInMinute;
    }
}
