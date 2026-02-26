package com.tingee.sdk.client;

import com.tingee.sdk.types.TingeeApiResponse;

/**
 * API-level error from Tingee API (when code !== "00")
 */
public class TingeeApiError extends RuntimeException {
    private final String code;
    private final TingeeApiResponse<?> response;

    public TingeeApiError(String message, String code, TingeeApiResponse<?> response) {
        super(message);
        this.code = code;
        this.response = response;
    }

    public String getCode() {
        return code;
    }

    public TingeeApiResponse<?> getResponse() {
        return response;
    }
}
