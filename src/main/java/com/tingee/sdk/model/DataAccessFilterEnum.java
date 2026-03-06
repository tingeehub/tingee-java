package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum DataAccessFilterEnum {
    REFERRAL_ONLY("referral-only"),
    DISTRIBUTOR_ONLY("distributor-only");

    private final String value;

    DataAccessFilterEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static DataAccessFilterEnum fromValue(String value) {
        for (DataAccessFilterEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
