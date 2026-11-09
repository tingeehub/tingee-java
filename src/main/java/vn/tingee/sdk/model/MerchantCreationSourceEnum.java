package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum MerchantCreationSourceEnum {
    TINGEE_BAAS("tingee-baas"),
    TINGEE_MERCHANT("tingee-merchant");

    private final String value;

    MerchantCreationSourceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static MerchantCreationSourceEnum fromValue(String value) {
        for (MerchantCreationSourceEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
