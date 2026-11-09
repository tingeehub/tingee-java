package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiDeviceNotifyOrderDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;
    @lombok.NonNull
    @JsonProperty("foodName")
    private DeviceNotifyOrderFoodNameEnum foodName;
    @JsonProperty("amount")
    private Double amount;

    /** Use this constructor to set all required fields. */
    public OpenApiDeviceNotifyOrderDto(String uuid, DeviceNotifyOrderFoodNameEnum foodName) {
        this.uuid = uuid;
        this.foodName = foodName;
    }
}
