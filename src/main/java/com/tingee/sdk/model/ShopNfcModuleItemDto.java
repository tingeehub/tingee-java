package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class ShopNfcModuleItemDto {
    @JsonProperty("googleConfig")
    private GoogleModuleConfigDto googleconfig;
    @JsonProperty("hotlineConfig")
    private HotlineModuleConfigDto hotlineconfig;
    @JsonProperty("emailConfig")
    private EmailModuleConfigDto emailconfig;
    @JsonProperty("zaloConfig")
    private ZaloModuleConfigDto zaloconfig;
    @JsonProperty("messengerConfig")
    private MessengerModuleConfigDto messengerconfig;
    @JsonProperty("paymentConfig")
    private PaymentModuleConfigDto paymentconfig;
    @JsonProperty("invoiceConfig")
    private InvoiceModuleConfigDto invoiceconfig;

    public ShopNfcModuleItemDto() {
    }

    public GoogleModuleConfigDto getGoogleconfig() {

        return googleconfig;

    }

    public HotlineModuleConfigDto getHotlineconfig() {

        return hotlineconfig;

    }

    public EmailModuleConfigDto getEmailconfig() {

        return emailconfig;

    }

    public ZaloModuleConfigDto getZaloconfig() {

        return zaloconfig;

    }

    public MessengerModuleConfigDto getMessengerconfig() {

        return messengerconfig;

    }

    public PaymentModuleConfigDto getPaymentconfig() {

        return paymentconfig;

    }

    public InvoiceModuleConfigDto getInvoiceconfig() {

        return invoiceconfig;

    }

    public void setGoogleconfig(GoogleModuleConfigDto googleconfig) {

        this.googleconfig = googleconfig;

    }

    public void setHotlineconfig(HotlineModuleConfigDto hotlineconfig) {

        this.hotlineconfig = hotlineconfig;

    }

    public void setEmailconfig(EmailModuleConfigDto emailconfig) {

        this.emailconfig = emailconfig;

    }

    public void setZaloconfig(ZaloModuleConfigDto zaloconfig) {

        this.zaloconfig = zaloconfig;

    }

    public void setMessengerconfig(MessengerModuleConfigDto messengerconfig) {

        this.messengerconfig = messengerconfig;

    }

    public void setPaymentconfig(PaymentModuleConfigDto paymentconfig) {

        this.paymentconfig = paymentconfig;

    }

    public void setInvoiceconfig(InvoiceModuleConfigDto invoiceconfig) {

        this.invoiceconfig = invoiceconfig;

    }
}
