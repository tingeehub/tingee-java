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
    @lombok.NonNull
    @JsonProperty("refundAmount")
    private Long refundAmount;
    @lombok.NonNull
    @JsonProperty("transactionId")
    private String transactionId;
    @lombok.NonNull
    @JsonProperty("status")
    private DirectDebitRefundStatusEnum status;

    /** Use this constructor to set all required fields. */
    public RefundOutputDto(Long refundAmount, String transactionId, DirectDebitRefundStatusEnum status) {
        this.refundAmount = refundAmount;
        this.transactionId = transactionId;
        this.status = status;
    }
}
