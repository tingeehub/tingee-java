package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class GetIncomeInvoicesListRequestDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("accountId")
    private Integer accountId;
    @JsonProperty("fromDate")
    private String fromDate;
    @JsonProperty("toDate")
    private String toDate;
    @JsonProperty("benBan")
    private String benBan;
    @JsonProperty("benMua")
    private String benMua;
    @JsonProperty("current")
    private Double current;
    @JsonProperty("ngayDuyetBd")
    private String ngayDuyetBd;
    @JsonProperty("ngayDuyetKt")
    private String ngayDuyetKt;
    @JsonProperty("ngayLapBd")
    private String ngayLapBd;
    @JsonProperty("ngayLapKt")
    private String ngayLapKt;
    @JsonProperty("ngayNhanBd")
    private String ngayNhanBd;
    @JsonProperty("ngayNhanKt")
    private String ngayNhanKt;
    @JsonProperty("nhanDan")
    private String nhanDan;
    @JsonProperty("page")
    private Double page;
    @JsonProperty("pageSize")
    private Double pageSize;
    @JsonProperty("size")
    private Double size;
    @JsonProperty("soHoaDon")
    private String soHoaDon;
    @JsonProperty("tinhChatHoaDon")
    private Double tinhChatHoaDon;
    @JsonProperty("trangThaiPheDuyet")
    private Double trangThaiPheDuyet;

}
