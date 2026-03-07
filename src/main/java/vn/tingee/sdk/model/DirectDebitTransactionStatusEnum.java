package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum DirectDebitTransactionStatusEnum {
    SUCCESS("success"),
    FAILURE("failure"),
    PENDING("pending"),
    PENDING_CONFIRM("pending-confirm"),
    CONFIRMED_AND_SENT_TO_DIRECT_DEBIT("confirmed-and-sent-to-direct-debit"),
    INSUFFICIENT_BALANCE("insufficient-balance"),
    EXCEED_DAILY_LIMIT("exceed-daily-limit"),
    REFUNDED("refunded");

    private final String value;

    DirectDebitTransactionStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static DirectDebitTransactionStatusEnum fromValue(String value) {
        for (DirectDebitTransactionStatusEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
