package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class MerchantPackageInfo {
    @JsonProperty("packageName")
    private String packagename;
    @JsonProperty("expirationDate")
    private LocalDateTime expirationdate;

    public MerchantPackageInfo() {
    }

    public String getPackagename() {

        return packagename;

    }

    public LocalDateTime getExpirationdate() {

        return expirationdate;

    }

    public void setPackagename(String packagename) {

        this.packagename = packagename;

    }

    public void setExpirationdate(LocalDateTime expirationdate) {

        this.expirationdate = expirationdate;

    }
}
