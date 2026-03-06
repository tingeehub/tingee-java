package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum OtpStbConfirmMethodEnum {
    SMSTTT("SMSTTT"),
    SMARTOTP("SmartOTP"),
    MCODE("mCode");

    private final String value;

    OtpStbConfirmMethodEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static OtpStbConfirmMethodEnum fromValue(String value) {
        for (OtpStbConfirmMethodEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
