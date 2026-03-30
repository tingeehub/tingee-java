package vn.tingee.sdk.model;

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
public class EInvoiceAccount {
    @lombok.NonNull
    @JsonProperty("id")
    private Integer id;
    @lombok.NonNull
    @JsonProperty("creationTime")
    private LocalDateTime creationTime;
    @JsonProperty("creatorUserId")
    private Double creatorUserId;
    @lombok.NonNull
    @JsonProperty("lastModificationTime")
    private LocalDateTime lastModificationTime;
    @JsonProperty("lastModifierUserId")
    private Double lastModifierUserId;
    @JsonProperty("deleterUserId")
    private Double deleterUserId;
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
    @lombok.NonNull
    @JsonProperty("password")
    private String password;
    @JsonProperty("isDefault")
    private Boolean isDefault;
    @JsonProperty("isActive")
    private Boolean isActive;

    /** Use this constructor to set all required fields. */
    public EInvoiceAccount(Integer id, LocalDateTime creationTime, LocalDateTime lastModificationTime, Double merchantId, EInvoiceProviderEnum provider, String taxCode, String username, String password) {
        this.id = id;
        this.creationTime = creationTime;
        this.lastModificationTime = lastModificationTime;
        this.merchantId = merchantId;
        this.provider = provider;
        this.taxCode = taxCode;
        this.username = username;
        this.password = password;
    }
}
