package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class GetIncomeInvoicePreviewBase64RequestDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("accountId")
    private Integer accountId;
    @lombok.NonNull
    @JsonProperty("maHoaDon")
    private String maHoaDon;

    /** Use this constructor to set all required fields. */
    public GetIncomeInvoicePreviewBase64RequestDto(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
}
