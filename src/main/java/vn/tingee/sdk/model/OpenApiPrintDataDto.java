package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenApiPrintDataDto {
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
    @JsonProperty("type")
    private Double type;
    @JsonProperty("branchName")
    private String branchName;
    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("sellerAddressLines")
    private List<String> sellerAddressLines;
    @JsonProperty("taxCode")
    private String taxCode;
    @JsonProperty("channelName")
    private String channelName;
    @JsonProperty("employeeCode")
    private String employeeCode;
    @JsonProperty("customerId")
    private String customerId;
    @JsonProperty("createdAt")
    private LocalDateTime createdAt;
    @JsonProperty("tax")
    private Double tax;
    @JsonProperty("vatReduction")
    private Double vatReduction;
    @JsonProperty("customerPaid")
    private Double customerPaid;
    @JsonProperty("paymentMethodLabel")
    private String paymentMethodLabel;
    @JsonProperty("paymentAmount")
    private Double paymentAmount;
    @JsonProperty("note")
    private String note;
    @JsonProperty("qrHint")
    private String qrHint;
    @JsonProperty("qrData")
    private String qrData;
    @JsonProperty("bankAccountName")
    private String bankAccountName;
    @JsonProperty("bankAccountNo")
    private String bankAccountNo;
    @JsonProperty("bankName")
    private String bankName;

    /** Use this constructor to set all required fields. */
    public OpenApiPrintDataDto(String storeName, List<OpenApiPrintReceiptItemDto> items, Long totalAmount) {
        this.storeName = storeName;
        this.items = items;
        this.totalAmount = totalAmount;
    }
}
