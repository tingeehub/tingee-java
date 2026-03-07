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
public class VPBInfoDto {
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("accountName")
    private String accountName;
    @JsonProperty("identity")
    private String identity;
    @JsonProperty("registerId")
    private String registerId;
    @JsonProperty("bankRegisterId")
    private String bankRegisterId;
    @JsonProperty("isWaitingForApproveDelete")
    private Boolean isWaitingForApproveDelete;
    @JsonProperty("softposUserName")
    private String softposUserName;
    @JsonProperty("softposDeveloperId")
    private String softposDeveloperId;
    @JsonProperty("softposTid")
    private String softposTid;
    @JsonProperty("softposMid")
    private String softposMid;

}
