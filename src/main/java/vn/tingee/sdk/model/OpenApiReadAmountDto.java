package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class OpenApiReadAmountDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("uuid")
    private String uuid;
    @lombok.NonNull
    @JsonProperty("transactionId")
    private String transactionId;
    @lombok.NonNull
    @JsonProperty("amount")
    private Long amount;
    @lombok.NonNull
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("firstDisplayText")
    private String firstDisplayText;
    @JsonProperty("secondDisplayText")
    private String secondDisplayText;
    @JsonProperty("thirdDisplayText")
    private String thirdDisplayText;
    @JsonProperty("playSound")
    private Boolean playSound;

    /** Use this constructor to set all required fields. */
    public OpenApiReadAmountDto(String uuid, String transactionId, Long amount, String bankBin) {
        this.uuid = uuid;
        this.transactionId = transactionId;
        this.amount = amount;
        this.bankBin = bankBin;
    }
}
