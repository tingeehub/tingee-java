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
public class EInvoiceProviderDto {
    @JsonProperty("code")
    private EInvoiceProviderEnum code;
    @JsonProperty("name")
    private String name;

}
