package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class SendNotifyTelegramDto {
    @lombok.NonNull
    @JsonProperty("chatId")
    private Double chatId;

    /** Use this constructor to set all required fields. */
    public SendNotifyTelegramDto(Double chatId) {
        this.chatId = chatId;
    }
}
