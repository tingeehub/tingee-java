package vn.tingee.sdk.model;

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
    @JsonProperty("qrCode")
    private String qrCode;
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    @JsonProperty("callbackUrl")
    private String callbackUrl;
    @lombok.NonNull
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("destinationBankBin")
    private String destinationBankBin;
    @JsonProperty("accountName")
    private String accountName;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("content")
    private String content;
    @JsonProperty("platform")
    private Double platform;
    @JsonProperty("billNumber")
    private String billNumber;

    /** Use this constructor to set all required fields. */
    public OpenApiDeepLinkDto(String type, String bankBin) {
        this.type = type;
        this.bankBin = bankBin;
    }
}
