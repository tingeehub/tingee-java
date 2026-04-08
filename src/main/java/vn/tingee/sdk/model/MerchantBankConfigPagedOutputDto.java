package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class MerchantBankConfigPagedOutputDto {
    @lombok.NonNull
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("creationTime")
    private LocalDateTime creationTime;
    @JsonProperty("creatorUserId")
    private Double creatorUserId;
    @JsonProperty("lastModificationTime")
    private LocalDateTime lastModificationTime;
    @JsonProperty("lastModifierUserId")
    private Double lastModifierUserId;
    @JsonProperty("deleterUserId")
    private Double deleterUserId;
    @lombok.NonNull
    @JsonProperty("merchantId")
    private Integer merchantId;
    @lombok.NonNull
    @JsonProperty("accountType")
    private BankAccountTypeEnum accountType;
    @JsonProperty("configDto")
    private Object configDto;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;
    @JsonProperty("bankName")
    private BankNameEnum bankName;

    /** Use this constructor to set all required fields. */
    public MerchantBankConfigPagedOutputDto(Integer id, Integer merchantId, BankAccountTypeEnum accountType) {
        this.id = id;
        this.merchantId = merchantId;
        this.accountType = accountType;
    }
}
