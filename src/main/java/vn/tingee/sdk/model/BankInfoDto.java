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
public class BankInfoDto {
    @JsonProperty("ocbInfoDto")
    private OCBInfoDto ocbInfoDto;
    @JsonProperty("tpbInfoDto")
    private TPBInfoDto tpbInfoDto;
    @JsonProperty("bidvInfoDto")
    private BIDVInfoDto bidvInfoDto;
    @JsonProperty("mbbInfoDto")
    private MBBInfoDto mbbInfoDto;
    @JsonProperty("acbInfoDto")
    private ACBInfoDto acbInfoDto;
    @JsonProperty("vpbInfoDto")
    private VPBInfoDto vpbInfoDto;
    @JsonProperty("shinhanInfoDto")
    private ShinhanInfoDto shinhanInfoDto;
    @JsonProperty("pgbInfoDto")
    private PGBInfoDto pgbInfoDto;
    @JsonProperty("vibInfoDto")
    private VIBInfoDto vibInfoDto;
    @JsonProperty("ctgInfoDto")
    private CTGInfoDto ctgInfoDto;
    @JsonProperty("stbInfoDto")
    private STBInfoDto stbInfoDto;
    @JsonProperty("agribankInfoDto")
    private AgribankInfoDto agribankInfoDto;
    @JsonProperty("vcbInfoDto")
    private VCBInfoDto vcbInfoDto;
    @JsonProperty("cobInfoDto")
    private COBInfoDto cobInfoDto;

}
