package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum QRCodeTypeEnum {
    DYNAMIC_ONE_TIME_PAYMENT("dynamic-one-time-payment"),
    DYNAMIC_RECURRING_PAYMENT("dynamic-recurring-payment");

    private final String value;

    QRCodeTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static QRCodeTypeEnum fromValue(String value) {
        for (QRCodeTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
