package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum BankAccountTypeEnum {
    PERSONAL_ACCOUNT("personal-account"),
    BUSINESS_ACCOUNT("business-account"),
    BUSINESS_HOUSEHOLD_ACCOUNT("business-household-account");

    private final String value;

    BankAccountTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static BankAccountTypeEnum fromValue(String value) {
        for (BankAccountTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
