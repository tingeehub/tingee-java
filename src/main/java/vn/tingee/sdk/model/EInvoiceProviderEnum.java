package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum EInvoiceProviderEnum {
    X_CYBER("x-cyber"),
    HILO("hilo"),
    S_INVOICE("s-invoice"),
    MISA("misa");

    private final String value;

    EInvoiceProviderEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static EInvoiceProviderEnum fromValue(String value) {
        for (EInvoiceProviderEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
