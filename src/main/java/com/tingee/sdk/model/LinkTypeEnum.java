package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum LinkTypeEnum {
    API_EXACT("api-exact"),
    MANUAL_EXACT("manual-exact"),
    MANUAL_INCLUDE("manual-include");

    private final String value;

    LinkTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static LinkTypeEnum fromValue(String value) {
        for (LinkTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
