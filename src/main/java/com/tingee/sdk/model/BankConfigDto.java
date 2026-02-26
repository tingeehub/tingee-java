package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class BankConfigDto {
    @JsonProperty("ocbConfigDtos")
    private List<OCBConfigDto> ocbconfigdtos;
    @JsonProperty("mbbConfigDtos")
    private List<MBBConfigDto> mbbconfigdtos;
    @JsonProperty("bidvConfigDtos")
    private List<BIDVConfigDto> bidvconfigdtos;
    @JsonProperty("shinhanConfigDtos")
    private List<ShinhanConfigDto> shinhanconfigdtos;
    @JsonProperty("vibConfigDtos")
    private List<VIBConfigDto> vibconfigdtos;
    @JsonProperty("ctgConfigDtos")
    private List<CTGConfigDto> ctgconfigdtos;
    @JsonProperty("acbConfigDto")
    private ACBConfigDto acbconfigdto;
    @JsonProperty("vpbConfigDto")
    private VPBConfigDto vpbconfigdto;
    @JsonProperty("vcbConfigDto")
    private VCBConfigDto vcbconfigdto;

    public BankConfigDto() {
    }

    public List<OCBConfigDto> getOcbconfigdtos() {

        return ocbconfigdtos;

    }

    public List<MBBConfigDto> getMbbconfigdtos() {

        return mbbconfigdtos;

    }

    public List<BIDVConfigDto> getBidvconfigdtos() {

        return bidvconfigdtos;

    }

    public List<ShinhanConfigDto> getShinhanconfigdtos() {

        return shinhanconfigdtos;

    }

    public List<VIBConfigDto> getVibconfigdtos() {

        return vibconfigdtos;

    }

    public List<CTGConfigDto> getCtgconfigdtos() {

        return ctgconfigdtos;

    }

    public ACBConfigDto getAcbconfigdto() {

        return acbconfigdto;

    }

    public VPBConfigDto getVpbconfigdto() {

        return vpbconfigdto;

    }

    public VCBConfigDto getVcbconfigdto() {

        return vcbconfigdto;

    }

    public void setOcbconfigdtos(List<OCBConfigDto> ocbconfigdtos) {

        this.ocbconfigdtos = ocbconfigdtos;

    }

    public void setMbbconfigdtos(List<MBBConfigDto> mbbconfigdtos) {

        this.mbbconfigdtos = mbbconfigdtos;

    }

    public void setBidvconfigdtos(List<BIDVConfigDto> bidvconfigdtos) {

        this.bidvconfigdtos = bidvconfigdtos;

    }

    public void setShinhanconfigdtos(List<ShinhanConfigDto> shinhanconfigdtos) {

        this.shinhanconfigdtos = shinhanconfigdtos;

    }

    public void setVibconfigdtos(List<VIBConfigDto> vibconfigdtos) {

        this.vibconfigdtos = vibconfigdtos;

    }

    public void setCtgconfigdtos(List<CTGConfigDto> ctgconfigdtos) {

        this.ctgconfigdtos = ctgconfigdtos;

    }

    public void setAcbconfigdto(ACBConfigDto acbconfigdto) {

        this.acbconfigdto = acbconfigdto;

    }

    public void setVpbconfigdto(VPBConfigDto vpbconfigdto) {

        this.vpbconfigdto = vpbconfigdto;

    }

    public void setVcbconfigdto(VCBConfigDto vcbconfigdto) {

        this.vcbconfigdto = vcbconfigdto;

    }
}
