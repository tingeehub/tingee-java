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
public class SendNotifyPlatformDto {
    @JsonProperty("telegramDtos")
    private List<SendNotifyTelegramDto> telegramDtos;
    @JsonProperty("larkDtos")
    private List<SendNotifyLarkDto> larkDtos;
    @JsonProperty("zaloDtos")
    private List<SendNotifyZaloDto> zaloDtos;
    @JsonProperty("tingeeBoxDtos")
    private List<SendNotifyTingeeBoxDto> tingeeBoxDtos;

}
