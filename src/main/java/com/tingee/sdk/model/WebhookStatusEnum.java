package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum WebhookStatusEnum {
    SUCCESS("success"),
    FAILED("failed"),
    PENDING("pending"),
    INSUFFICIENT_BALANCE("insufficient-balance"),
    EXCEED_DAILY_LIMIT("exceed-daily-limit"),
    CONFIRM_VA_SUCCESS("confirm-va-success"),
    CONFIRM_VA_FAILED("confirm-va-failed");

    private final String value;

    WebhookStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static WebhookStatusEnum fromValue(String value) {
        for (WebhookStatusEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
