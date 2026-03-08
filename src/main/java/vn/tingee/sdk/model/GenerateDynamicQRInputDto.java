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

    /** Use this constructor to set all required fields. */
    public GenerateDynamicQRInputDto(String vaAccountNumber, QRCodeTypeEnum qrCodeType) {
        this.vaAccountNumber = vaAccountNumber;
        this.qrCodeType = qrCodeType;
    }
}
