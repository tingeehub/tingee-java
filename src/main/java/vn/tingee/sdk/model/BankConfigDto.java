package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class BankConfigDto {
    @JsonProperty("ocbConfigDtos")
    private List<OCBConfigDto> ocbConfigDtos;
    @JsonProperty("mbbConfigDtos")
    private List<MBBConfigDto> mbbConfigDtos;
    @JsonProperty("bidvConfigDtos")
    private List<BIDVConfigDto> bidvConfigDtos;
    @JsonProperty("shinhanConfigDtos")
    private List<ShinhanConfigDto> shinhanConfigDtos;
    @JsonProperty("vibConfigDtos")
    private List<VIBConfigDto> vibConfigDtos;
    @JsonProperty("ctgConfigDtos")
    private List<CTGConfigDto> ctgConfigDtos;
    @JsonProperty("acbConfigDto")
    private ACBConfigDto acbConfigDto;
    @JsonProperty("vpbConfigDto")
    private VPBConfigDto vpbConfigDto;
    @JsonProperty("vcbConfigDto")
    private VCBConfigDto vcbConfigDto;

}
