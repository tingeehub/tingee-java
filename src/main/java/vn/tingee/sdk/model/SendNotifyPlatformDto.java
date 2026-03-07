package vn.tingee.sdk.model;

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
public class SendNotifyPlatformDto {
    @lombok.NonNull
    @JsonProperty("telegramDtos")
    private List<SendNotifyTelegramDto> telegramDtos;
    @lombok.NonNull
    @JsonProperty("larkDtos")
    private List<SendNotifyLarkDto> larkDtos;
    @lombok.NonNull
    @JsonProperty("zaloDtos")
    private List<SendNotifyZaloDto> zaloDtos;
    @lombok.NonNull
    @JsonProperty("tingeeBoxDtos")
    private List<SendNotifyTingeeBoxDto> tingeeBoxDtos;

    /** Use this constructor to set all required fields. */
    public SendNotifyPlatformDto(List<SendNotifyTelegramDto> telegramDtos, List<SendNotifyLarkDto> larkDtos, List<SendNotifyZaloDto> zaloDtos, List<SendNotifyTingeeBoxDto> tingeeBoxDtos) {
        this.telegramDtos = telegramDtos;
        this.larkDtos = larkDtos;
        this.zaloDtos = zaloDtos;
        this.tingeeBoxDtos = tingeeBoxDtos;
    }
}
