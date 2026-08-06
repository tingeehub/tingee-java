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
public class GetPagingEInvoiceAccountOutputDto {
    @lombok.NonNull
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("creationTime")
    private LocalDateTime creationTime;
    @lombok.NonNull
    @JsonProperty("merchantId")
    private Double merchantId;
    @lombok.NonNull
    @JsonProperty("masterMerchantId")
    private Double masterMerchantId;
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
    @JsonProperty("services")
    private List<String> services;

    /** Use this constructor to set all required fields. */
    public GetPagingEInvoiceAccountOutputDto(Integer id, Double merchantId, Double masterMerchantId, EInvoiceProviderEnum provider, String taxCode, String username, String password) {
        this.id = id;
        this.merchantId = merchantId;
        this.masterMerchantId = masterMerchantId;
        this.provider = provider;
        this.taxCode = taxCode;
        this.username = username;
        this.password = password;
    }
}
