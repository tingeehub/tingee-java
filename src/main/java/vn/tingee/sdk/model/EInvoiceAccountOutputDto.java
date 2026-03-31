package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class EInvoiceAccountOutputDto {
    @lombok.NonNull
    @JsonProperty("id")
    private Integer id;
    @lombok.NonNull
    @JsonProperty("creationTime")
    private LocalDateTime creationTime;
    @lombok.NonNull
    @JsonProperty("merchantId")
    private Double merchantId;
    @lombok.NonNull
    @JsonProperty("provider")
    private EInvoiceProviderEnum provider;
    @lombok.NonNull
    @JsonProperty("taxCode")
    private String taxCode;
    @lombok.NonNull
    @JsonProperty("username")
    private String username;
    @JsonProperty("isDefault")
    private Boolean isDefault;
    @JsonProperty("isActive")
    private Boolean isActive;

    /** Use this constructor to set all required fields. */
    public EInvoiceAccountOutputDto(Integer id, LocalDateTime creationTime, Double merchantId, EInvoiceProviderEnum provider, String taxCode, String username) {
        this.id = id;
        this.creationTime = creationTime;
        this.merchantId = merchantId;
        this.provider = provider;
        this.taxCode = taxCode;
        this.username = username;
    }
}
