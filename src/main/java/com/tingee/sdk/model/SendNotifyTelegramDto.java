package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class SendNotifyTelegramDto {
    @JsonProperty("chatId")
    private Double chatid;

    public SendNotifyTelegramDto() {
    }

    public Double getChatid() {

        return chatid;

    }

    public void setChatid(Double chatid) {

        this.chatid = chatid;

    }
}
