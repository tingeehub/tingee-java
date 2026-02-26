package com.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
public class FileUploadDto {
    @JsonProperty("fileLogId")
    private String filelogid;
    @JsonProperty("path")
    private String path;

    public FileUploadDto() {
    }

    public String getFilelogid() {

        return filelogid;

    }

    public String getPath() {

        return path;

    }

    public void setFilelogid(String filelogid) {

        this.filelogid = filelogid;

    }

    public void setPath(String path) {

        this.path = path;

    }
}
