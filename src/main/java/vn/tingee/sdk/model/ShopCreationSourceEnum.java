package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum ShopCreationSourceEnum {
    TINGEE_BAAS("tingee-baas"),
    TINGEE_MERCHANT("tingee-merchant"),
    TINGEE_BOX("tingee-box");

    private final String value;

    ShopCreationSourceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ShopCreationSourceEnum fromValue(String value) {
        for (ShopCreationSourceEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
