package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum DeviceTypeEnum {
    APP_TINGEE("app-tingee"),
    TINGEE_BOX_F1("tingee-box-f1"),
    TINGEE_BOX_2A("tingee-box-2a"),
    TINGEE_BOX_2AS("tingee-box-2as"),
    TINGEE_BOX_S1("tingee-box-s1"),
    TINGEE_BOX_3LS("tingee-box-3ls"),
    TINGEE_BOX_3PRO("tingee-box-3pro"),
    TINGEE_BOX_3VN("tingee-box-3vn"),
    TINGEE_BOX_3VNA("tingee-box-3vna"),
    TINGEE_BOX_4LS("tingee-box-4ls"),
    TINGEE_BOX_5S("tingee-box-5s"),
    TINGEE_BOX_5SA("tingee-box-5sa"),
    TINGEE_BOX_6LS("tingee-box-6ls"),
    TINGEE_BOX_6PRO("tingee-box-6pro"),
    TINGEE_BOX_6XS("tingee-box-6xs"),
    VN_50("vn-50"),
    LOA_PAY("loa-pay"),
    TRUSTED_PAY("trusted-pay"),
    TINGEE_BOX_3VN_MBB("tingee-box-3vn-mbb"),
    TINGEE_BOX_3PRO_MBB("tingee-box-3pro-mbb"),
    TINGEE_BOX_3PRO_X("tingee-box-3pro-x"),
    TINGEE_BOX_MAX("tingee-box-max"),
    TINGEE_BOX_8PRO("tingee-box-8pro");

    private final String value;

    DeviceTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static DeviceTypeEnum fromValue(String value) {
        for (DeviceTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
