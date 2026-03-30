package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class CreateOrUpdateEInvoiceAccountDto {
    @lombok.NonNull
    @JsonProperty("provider")
    private EInvoiceProviderEnum provider;
    @lombok.NonNull
    @JsonProperty("taxCode")
    private String taxCode;
    @lombok.NonNull
    @JsonProperty("username")
    private String username;
    @lombok.NonNull
    @JsonProperty("password")
    private String password;
    @JsonProperty("isDefault")
    private Boolean isDefault;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("merchantId")
    private Integer merchantId;

    /** Use this constructor to set all required fields. */
    public CreateOrUpdateEInvoiceAccountDto(EInvoiceProviderEnum provider, String taxCode, String username, String password) {
        this.provider = provider;
        this.taxCode = taxCode;
        this.username = username;
        this.password = password;
    }
}
