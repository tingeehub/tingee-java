package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class OneQRDto {
    @lombok.NonNull
    @JsonProperty("isValid")
    private Boolean isValid;
    @lombok.NonNull
    @JsonProperty("provider")
    private Provider provider;
    @lombok.NonNull
    @JsonProperty("consumer")
    private Consumer consumer;
    @lombok.NonNull
    @JsonProperty("merchant")
    private Merchant merchant;
    @lombok.NonNull
    @JsonProperty("additionalData")
    private AdditionalData additionalData;
    @lombok.NonNull
    @JsonProperty("version")
    private String version;
    @lombok.NonNull
    @JsonProperty("initMethod")
    private String initMethod;
    @lombok.NonNull
    @JsonProperty("category")
    private String category;
    @lombok.NonNull
    @JsonProperty("currency")
    private String currency;
    @lombok.NonNull
    @JsonProperty("nation")
    private String nation;
    @lombok.NonNull
    @JsonProperty("city")
    private String city;
    @lombok.NonNull
    @JsonProperty("crc")
    private String crc;

    /** Use this constructor to set all required fields. */
    public OneQRDto(Boolean isValid, Provider provider, Consumer consumer, Merchant merchant, AdditionalData additionalData, String version, String initMethod, String category, String currency, String nation, String city, String crc) {
        this.isValid = isValid;
        this.provider = provider;
        this.consumer = consumer;
        this.merchant = merchant;
        this.additionalData = additionalData;
        this.version = version;
        this.initMethod = initMethod;
        this.category = category;
        this.currency = currency;
        this.nation = nation;
        this.city = city;
        this.crc = crc;
    }
}
