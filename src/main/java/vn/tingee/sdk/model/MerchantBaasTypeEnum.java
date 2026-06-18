package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum MerchantBaasTypeEnum {
    TRIAL("trial"),
    TRIAL_EXTENDED("trial-extended"),
    CUSTOMER("customer"),
    CANCELLED("cancelled"),
    UNCLASSIFIED("unclassified");

    private final String value;

    MerchantBaasTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static MerchantBaasTypeEnum fromValue(String value) {
        for (MerchantBaasTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
