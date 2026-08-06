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
public class CreateBankLinkSessionInputDto {
    @JsonProperty("merchantId")
    private Integer merchantId;
    @JsonProperty("shopId")
    private Integer shopId;
    @JsonProperty("merchantAccountNumberId")
    private Integer merchantAccountNumberId;
    @JsonProperty("allowedBanks")
    private List<BankNameEnum> allowedBanks;
    @JsonProperty("disallowedBanks")
    private List<BankNameEnum> disallowedBanks;
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @JsonProperty("type")
    private BankLinkSessionTypeEnum type;
    @JsonProperty("metadata")
    private String metadata;
    @JsonProperty("redirectUrl")
    private String redirectUrl;

}
