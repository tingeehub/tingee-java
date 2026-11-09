package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum EInvoiceServiceEnum {
    OUTPUT_INVOICE("output-invoice"),
    INPUT_INVOICE("input-invoice");

    private final String value;

    EInvoiceServiceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static EInvoiceServiceEnum fromValue(String value) {
        for (EInvoiceServiceEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
