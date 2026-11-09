package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum DeviceNotifyOrderFoodNameEnum {
    BEFOOD("befood"),
    SHOPEEFOOD("shopeefood"),
    XANHSMFOOD("xanhsmfood"),
    GREENSMFOOD("greensmfood"),
    GRABFOOD("grabfood"),
    AHAMOVE("ahamove"),
    OTHER("other");

    private final String value;

    DeviceNotifyOrderFoodNameEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static DeviceNotifyOrderFoodNameEnum fromValue(String value) {
        for (DeviceNotifyOrderFoodNameEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
