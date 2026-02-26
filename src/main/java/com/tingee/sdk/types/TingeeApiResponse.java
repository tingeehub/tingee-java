package com.tingee.sdk.types;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Standard API response structure from Tingee API
 * 
 * @param <T> Type of the data field
 */
public class TingeeApiResponse<T> {
    @JsonProperty("code")
    private String code;
    
    @JsonProperty("message")
    private String message;
    
    @JsonProperty("data")
    private T data;

    public TingeeApiResponse() {
    }

    public TingeeApiResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * Check if the response indicates success
     * @return true if code is "00"
     */
    public boolean isSuccess() {
        return "00".equals(code);
    }

    /**
     * Check if the response indicates an error
     * @return true if code is not "00"
     */
    public boolean isError() {
        return !isSuccess();
    }
}
