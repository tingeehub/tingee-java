package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class PaymentBillResponseDto {
    @JsonProperty("code")
    private String code;
    @JsonProperty("status")
    private String status;
    @JsonProperty("transactionCode")
    private String transactioncode;
    @JsonProperty("isSentConfirmEmail")
    private Boolean issentconfirmemail;
    @JsonProperty("isSentConfirmZalo")
    private Boolean issentconfirmzalo;
    @JsonProperty("returnUrl")
    private String returnurl;

    public PaymentBillResponseDto() {
    }

    public String getCode() {

        return code;

    }

    public String getStatus() {

        return status;

    }

    public String getTransactioncode() {

        return transactioncode;

    }

    public Boolean getIssentconfirmemail() {

        return issentconfirmemail;

    }

    public Boolean getIssentconfirmzalo() {

        return issentconfirmzalo;

    }

    public String getReturnurl() {

        return returnurl;

    }

    public void setCode(String code) {

        this.code = code;

    }

    public void setStatus(String status) {

        this.status = status;

    }

    public void setTransactioncode(String transactioncode) {

        this.transactioncode = transactioncode;

    }

    public void setIssentconfirmemail(Boolean issentconfirmemail) {

        this.issentconfirmemail = issentconfirmemail;

    }

    public void setIssentconfirmzalo(Boolean issentconfirmzalo) {

        this.issentconfirmzalo = issentconfirmzalo;

    }

    public void setReturnurl(String returnurl) {

        this.returnurl = returnurl;

    }
}
