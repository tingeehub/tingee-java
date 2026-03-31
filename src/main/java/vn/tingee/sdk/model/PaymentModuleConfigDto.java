package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentModuleConfigDto {
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("position")
    private Double position;
    @JsonProperty("accountNumberIds")
    private List<String> accountNumberIds;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;

}
