package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum DirectDebitRefundStatusEnum {
    SUCCESS("success"),
    FAILURE("failure"),
    PENDING("Pending");

    private final String value;

    DirectDebitRefundStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static DirectDebitRefundStatusEnum fromValue(String value) {
        for (DirectDebitRefundStatusEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
