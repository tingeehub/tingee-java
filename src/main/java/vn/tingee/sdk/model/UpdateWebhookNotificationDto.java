package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class UpdateWebhookNotificationDto {
    @JsonProperty("webhookUrl")
    private String webhookUrl;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("targetId")
    private Integer targetId;
    @JsonProperty("type")
    private EventUrlItemType type;
    @lombok.NonNull
    @JsonProperty("isActive")
    private Boolean isActive;

    /** Use this constructor to set all required fields. */
    public UpdateWebhookNotificationDto(Boolean isActive) {
        this.isActive = isActive;
    }
}
