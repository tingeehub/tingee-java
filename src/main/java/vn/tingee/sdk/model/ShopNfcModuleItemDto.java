package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class ShopNfcModuleItemDto {
    @JsonProperty("googleConfig")
    private GoogleModuleConfigDto googleConfig;
    @JsonProperty("hotlineConfig")
    private HotlineModuleConfigDto hotlineConfig;
    @JsonProperty("emailConfig")
    private EmailModuleConfigDto emailConfig;
    @JsonProperty("zaloConfig")
    private ZaloModuleConfigDto zaloConfig;
    @JsonProperty("messengerConfig")
    private MessengerModuleConfigDto messengerConfig;
    @JsonProperty("paymentConfig")
    private PaymentModuleConfigDto paymentConfig;
    @JsonProperty("invoiceConfig")
    private InvoiceModuleConfigDto invoiceConfig;

}
