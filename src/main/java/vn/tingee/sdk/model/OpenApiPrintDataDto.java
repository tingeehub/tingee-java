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
    @JsonProperty("templateType")
    private String templateType;
    @JsonProperty("lineWidth")
    private Integer lineWidth;
    @JsonProperty("qrAlignment")
    private String qrAlignment;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("title")
    private String title;
    @lombok.NonNull
    @JsonProperty("storeName")
    private String storeName;
    @JsonProperty("branchName")
    private String branchName;
    @JsonProperty("address")
    private String address;
    @JsonProperty("hotline")
    private String hotline;
    @JsonProperty("orderCode")
    private String orderCode;
    @JsonProperty("invoiceNo")
    private String invoiceNo;
    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("customerId")
    private String customerId;
    @JsonProperty("sellerAddressLines")
    private List<String> sellerAddressLines;
    @JsonProperty("taxCode")
    private String taxCode;
    @JsonProperty("channelName")
    private String channelName;
    @JsonProperty("employeeCode")
    private String employeeCode;
    @JsonProperty("createdAt")
    private LocalDateTime createdAt;
    @lombok.NonNull
    @JsonProperty("items")
    private List<OpenApiPrintReceiptItemDto> items;
    @lombok.NonNull
    @JsonProperty("totalAmount")
    private Long totalAmount;
    @JsonProperty("discount")
    private Long discount;
    @JsonProperty("vatReduction")
    private Long vatReduction;
    @JsonProperty("paidAmount")
    private Long paidAmount;
    @JsonProperty("customerPaid")
    private Long customerPaid;
    @JsonProperty("paymentMethodLabel")
    private String paymentMethodLabel;
    @JsonProperty("paymentAmount")
    private Long paymentAmount;
    @JsonProperty("invoiceStage")
    private String invoiceStage;
    @JsonProperty("changeAmount")
    private Long changeAmount;
    @JsonProperty("qrCode")
    private String qrCode;
    @JsonProperty("qrHint")
    private String qrHint;
    @JsonProperty("barcode")
    private String barcode;
    @JsonProperty("footerNote")
    private String footerNote;
    @JsonProperty("note")
    private String note;
    @JsonProperty("bankAccountName")
    private String bankAccountName;
    @JsonProperty("bankAccountNo")
    private String bankAccountNo;
    @JsonProperty("bankName")
    private String bankName;
    @JsonProperty("voiceFile")
    private Integer voiceFile;
    @JsonProperty("copies")
    private Integer copies;

    /** Use this constructor to set all required fields. */
    public OpenApiPrintDataDto(String storeName, List<OpenApiPrintReceiptItemDto> items, Long totalAmount) {
        this.storeName = storeName;
        this.items = items;
        this.totalAmount = totalAmount;
    }
}
