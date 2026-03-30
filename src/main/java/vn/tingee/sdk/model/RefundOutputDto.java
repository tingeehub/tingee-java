package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class RefundOutputDto {
    @JsonProperty("refundAmount")
    private Long refundAmount;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("status")
    private DirectDebitRefundStatusEnum status;

}
