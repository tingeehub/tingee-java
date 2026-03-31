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
public class SendNotifyLarkDto {
    @lombok.NonNull
    @JsonProperty("urlWebhook")
    private String urlWebhook;

    /** Use this constructor to set all required fields. */
    public SendNotifyLarkDto(String urlWebhook) {
        this.urlWebhook = urlWebhook;
    }
}
