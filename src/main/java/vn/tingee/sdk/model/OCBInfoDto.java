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
public class OCBInfoDto {
    @JsonProperty("vaPrefix")
    private String vaPrefix;
    @JsonProperty("identificationNumber")
    private String identificationNumber;
    @JsonProperty("accountName")
    private String accountName;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("registerDate")
    private String registerDate;
    @JsonProperty("vaAccountNumber")
    private String vaAccountNumber;
    @JsonProperty("merchantName")
    private String merchantName;
    @JsonProperty("merchantAddress")
    private String merchantAddress;
    @JsonProperty("mobilePhone")
    private String mobilePhone;
    @JsonProperty("email")
    private String email;

}
