package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiCreatePaymentLinkInputDto {
    @lombok.NonNull
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("orderId")
    private String orderId;
    @lombok.NonNull
    @JsonProperty("requestId")
    private String requestId;
    @lombok.NonNull
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("expireInMinute")
    private Double expireInMinute;
    @JsonProperty("description")
    private String description;
    @JsonProperty("orderInfo")
    private String orderInfo;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("returnUrl")
    private String returnUrl;
    @JsonProperty("customerEmail")
    private String customerEmail;
    @JsonProperty("paymentGroup")
    private String paymentGroup;

    /** Use this constructor to set all required fields. */
    public OpenApiCreatePaymentLinkInputDto(Integer merchantId, String orderId, String requestId, Double amount) {
        this.merchantId = merchantId;
        this.orderId = orderId;
        this.requestId = requestId;
        this.amount = amount;
    }
}
