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
public class FileUploadDto {
    @lombok.NonNull
    @JsonProperty("fileLogId")
    private String fileLogId;
    @lombok.NonNull
    @JsonProperty("path")
    private String path;

    /** Use this constructor to set all required fields. */
    public FileUploadDto(String fileLogId, String path) {
        this.fileLogId = fileLogId;
        this.path = path;
    }
}
