package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class SendNotifyPlatformDto {
    @JsonProperty("telegramDtos")
    private List<SendNotifyTelegramDto> telegramdtos;
    @JsonProperty("larkDtos")
    private List<SendNotifyLarkDto> larkdtos;
    @JsonProperty("zaloDtos")
    private List<SendNotifyZaloDto> zalodtos;
    @JsonProperty("tingeeBoxDtos")
    private List<SendNotifyTingeeBoxDto> tingeeboxdtos;

    public SendNotifyPlatformDto() {
    }

    public List<SendNotifyTelegramDto> getTelegramdtos() {

        return telegramdtos;

    }

    public List<SendNotifyLarkDto> getLarkdtos() {

        return larkdtos;

    }

    public List<SendNotifyZaloDto> getZalodtos() {

        return zalodtos;

    }

    public List<SendNotifyTingeeBoxDto> getTingeeboxdtos() {

        return tingeeboxdtos;

    }

    public void setTelegramdtos(List<SendNotifyTelegramDto> telegramdtos) {

        this.telegramdtos = telegramdtos;

    }

    public void setLarkdtos(List<SendNotifyLarkDto> larkdtos) {

        this.larkdtos = larkdtos;

    }

    public void setZalodtos(List<SendNotifyZaloDto> zalodtos) {

        this.zalodtos = zalodtos;

    }

    public void setTingeeboxdtos(List<SendNotifyTingeeBoxDto> tingeeboxdtos) {

        this.tingeeboxdtos = tingeeboxdtos;

    }
}
