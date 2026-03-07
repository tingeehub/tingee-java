package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiAddDeviceToShop {
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;
    @lombok.NonNull
    @JsonProperty("securityCode")
    private String securityCode;
    @lombok.NonNull
    @JsonProperty("appType")
    private AppTypeEnum appType;
    @JsonProperty("masterMerchantId")
    private Double masterMerchantId;
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("vaAccountNumbers")
    private List<String> vaAccountNumbers;
    @JsonProperty("shopIds")
    private List<Double> shopIds;

    /** Use this constructor to set all required fields. */
    public OpenApiAddDeviceToShop(String uuid, String securityCode, AppTypeEnum appType) {
        this.uuid = uuid;
        this.securityCode = securityCode;
        this.appType = appType;
    }
}
