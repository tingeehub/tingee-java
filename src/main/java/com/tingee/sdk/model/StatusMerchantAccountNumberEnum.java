package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum StatusMerchantAccountNumberEnum {
    INACTIVE("inactive"),
    ACTIVE("active"),
    LOCK("lock");

    private final String value;

    StatusMerchantAccountNumberEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static StatusMerchantAccountNumberEnum fromValue(String value) {
        for (StatusMerchantAccountNumberEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
