package com.tingee.sdk.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.tingee.sdk.signature.SignatureUtils;
import com.tingee.sdk.types.TingeeApiResponse;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * HTTP client for Tingee API
 * Handles signature generation and request execution
 */
public class TingeeHttpClient {
    private static final Logger logger = LoggerFactory.getLogger(TingeeHttpClient.class);
    private static final ObjectMapper objectMapper = new ObjectMapper()
        .registerModule(new JavaTimeModule());

    private final String baseUrl;
    private final String secretKey;
    private final String clientId;
    private final int defaultTimeout;
    private final OkHttpClient httpClient;

    public TingeeHttpClient(String baseUrl, String secretKey, String clientId, int timeout) {
        this.baseUrl = baseUrl.replaceAll("/$", "");
        this.secretKey = secretKey;
        this.clientId = clientId;
        this.defaultTimeout = timeout;

        this.httpClient = new OkHttpClient.Builder()
            .connectTimeout(timeout, TimeUnit.MILLISECONDS)
            .readTimeout(timeout, TimeUnit.MILLISECONDS)
            .writeTimeout(timeout, TimeUnit.MILLISECONDS)
            .build();
    }

    /**
     * Execute HTTP request
     */
    public <T> TingeeApiResponse<T> request(
        String method,
        String path,
        Object body,
        Map<String, String> queryParams,
        Class<T> responseType
    ) throws IOException {
        String timestamp = SignatureUtils.formatTimestamp();
        String signature = SignatureUtils.generateSignature(secretKey, timestamp, body != null ? body : new HashMap<>());

        // Build URL with query parameters
        HttpUrl.Builder urlBuilder = HttpUrl.parse(baseUrl + (path.startsWith("/") ? path : "/" + path)).newBuilder();
        if (queryParams != null) {
            for (Map.Entry<String, String> entry : queryParams.entrySet()) {
                if (entry.getValue() != null) {
                    urlBuilder.addQueryParameter(entry.getKey(), entry.getValue());
                }
            }
        }
        String url = urlBuilder.build().toString();

        // Build request body
        RequestBody requestBody = null;
        if (body != null && (method.equals("POST") || method.equals("PUT") || method.equals("PATCH"))) {
            String jsonBody = objectMapper.writeValueAsString(body);
            requestBody = RequestBody.create(jsonBody, MediaType.parse("application/json"));
        }

        // Build request
        Request.Builder requestBuilder = new Request.Builder()
            .url(url)
            .addHeader("accept", "application/json")
            .addHeader("content-type", "application/json")
            .addHeader("x-signature", signature)
            .addHeader("x-request-timestamp", timestamp)
            .addHeader("x-client-id", clientId);

        if (requestBody != null) {
            requestBuilder.method(method.toUpperCase(), requestBody);
        } else {
            requestBuilder.method(method.toUpperCase(), null);
        }

        Request request = requestBuilder.build();

        // Execute request
        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                String errorBody = response.body() != null ? response.body().string() : "";
                throw new TingeeHttpError(
                    "Request failed with status " + response.code(),
                    response.code(),
                    errorBody
                );
            }

            String responseBody = response.body() != null ? response.body().string() : "{}";
            TingeeApiResponse<T> apiResponse = objectMapper.readValue(
                responseBody,
                objectMapper.getTypeFactory().constructParametricType(
                    TingeeApiResponse.class,
                    responseType
                )
            );

            // Check if API returned an error
            if (apiResponse.isError()) {
                throw new TingeeApiError(
                    apiResponse.getMessage() != null ? apiResponse.getMessage() : "API request failed",
                    apiResponse.getCode(),
                    apiResponse
                );
            }

            return apiResponse;
        }
    }
}
