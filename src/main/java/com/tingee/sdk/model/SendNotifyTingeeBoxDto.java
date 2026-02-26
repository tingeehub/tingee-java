package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class SendNotifyTingeeBoxDto {
    @JsonProperty("type")
    private DeviceTypeEnum type;
    @JsonProperty("uuid")
    private String uuid;

    public SendNotifyTingeeBoxDto() {
    }

    public DeviceTypeEnum getType() {

        return type;

    }

    public String getUuid() {

        return uuid;

    }

    public void setType(DeviceTypeEnum type) {

        this.type = type;

    }

    public void setUuid(String uuid) {

        this.uuid = uuid;

    }
}
