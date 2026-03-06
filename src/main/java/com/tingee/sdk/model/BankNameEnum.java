package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum BankNameEnum {
    OCB("OCB"),
    BIDV("BIDV"),
    MBB("MBB"),
    ACB("ACB"),
    VPB("VPB"),
    PGB("PGB"),
    VIB("VIB"),
    STB("STB"),
    CTG("CTG"),
    VCB("VCB"),
    AGRIBANK("AGRIBANK"),
    SHINHAN("SHINHAN"),
    COB("COB"),
    MSB("MSB");

    private final String value;

    BankNameEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static BankNameEnum fromValue(String value) {
        for (BankNameEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
