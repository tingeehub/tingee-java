package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Auto-generated from OpenAPI spec — DO NOT EDIT MANUALLY
 */
public enum AppTypeEnum {
    OCB_WEB("ocb-web"),
    OCB_APP("ocb-app"),
    BIDV_WEB("bidv-web"),
    BIDV_APP("bidv-app"),
    STB_WEB("stb-web"),
    STB_APP("stb-app"),
    VCB_WEB("vcb-web"),
    VCB_APP("vcb-app"),
    TINGEE_WEB("tingee-web"),
    TINGEE_APP("tingee-app"),
    TINGEE_MERCHANT_APP("tingee-merchant-app"),
    LOA_HUB("loa-hub"),
    MINI_APP_MBB("mini-app-mbb"),
    BAAS("baas");

    private final String value;

    AppTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static AppTypeEnum fromValue(String value) {
        for (AppTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
