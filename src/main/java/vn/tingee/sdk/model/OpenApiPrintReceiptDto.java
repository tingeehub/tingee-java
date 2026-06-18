package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiPrintReceiptDto {
    @JsonProperty("logo")
    private String logo;
    @lombok.NonNull
    @JsonProperty("storeName")
    private String storeName;
    @JsonProperty("address")
    private String address;
    @JsonProperty("hotline")
    private String hotline;
    @JsonProperty("orderCode")
    private String orderCode;
    @lombok.NonNull
    @JsonProperty("items")
    private List<OpenApiPrintReceiptItemDto> items;
    @lombok.NonNull
    @JsonProperty("totalAmount")
    private Long totalAmount;
    @JsonProperty("discount")
    private Long discount;
    @JsonProperty("qrCode")
    private String qrCode;
    @JsonProperty("barcode")
    private String barcode;
    @JsonProperty("footerNote")
    private String footerNote;
    @JsonProperty("voiceFile")
    private Integer voiceFile;
    @JsonProperty("copies")
    private Integer copies;
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;

    /** Use this constructor to set all required fields. */
    public OpenApiPrintReceiptDto(String storeName, List<OpenApiPrintReceiptItemDto> items, Long totalAmount, String uuid) {
        this.storeName = storeName;
        this.items = items;
        this.totalAmount = totalAmount;
        this.uuid = uuid;
    }
}
