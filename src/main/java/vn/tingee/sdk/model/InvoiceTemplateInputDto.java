package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class InvoiceTemplateInputDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("accountId")
    private Integer accountId;
    @JsonProperty("provider")
    private EInvoiceProviderEnum provider;
    @JsonProperty("taxCode")
    private String taxCode;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("invoiceNoToCheck")
    private Integer invoiceNoToCheck;

}
