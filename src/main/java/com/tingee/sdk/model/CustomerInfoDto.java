package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class CustomerInfoDto {
    @JsonProperty("onepayAccountId")
    private String onepayaccountid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("email")
    private String email;

    public CustomerInfoDto() {
    }

    public String getOnepayaccountid() {

        return onepayaccountid;

    }

    public String getName() {

        return name;

    }

    public String getPhone() {

        return phone;

    }

    public String getEmail() {

        return email;

    }

    public void setOnepayaccountid(String onepayaccountid) {

        this.onepayaccountid = onepayaccountid;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setPhone(String phone) {

        this.phone = phone;

    }

    public void setEmail(String email) {

        this.email = email;

    }
}
