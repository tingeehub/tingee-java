package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class OpenApiVerifyReferralCodeResponseDto {
    @JsonProperty("isValid")
    private Boolean isvalid;
    @JsonProperty("canConnectAllBanks")
    private Boolean canconnectallbanks;
    @JsonProperty("bankBins")
    private List<String> bankbins;

    public OpenApiVerifyReferralCodeResponseDto() {
    }

    public Boolean getIsvalid() {

        return isvalid;

    }

    public Boolean getCanconnectallbanks() {

        return canconnectallbanks;

    }

    public List<String> getBankbins() {

        return bankbins;

    }

    public void setIsvalid(Boolean isvalid) {

        this.isvalid = isvalid;

    }

    public void setCanconnectallbanks(Boolean canconnectallbanks) {

        this.canconnectallbanks = canconnectallbanks;

    }

    public void setBankbins(List<String> bankbins) {

        this.bankbins = bankbins;

    }
}
