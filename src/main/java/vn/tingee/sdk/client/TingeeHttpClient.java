package vn.tingee.sdk.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import vn.tingee.sdk.signature.SignatureUtils;
import vn.tingee.sdk.types.TingeeApiResponse;
import okhttp3.*;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * HTTP client for Tingee API
 * Handles signature generation and request execution
 */
public class TingeeHttpClient {
    private static final ObjectMapper objectMapper = new ObjectMapper()
        .registerModule(new JavaTimeModule());

    private final String baseUrl;
    private final String secretKey;
    private final String clientId;
    private final OkHttpClient httpClient;

    public TingeeHttpClient(String baseUrl, String secretKey, String clientId, int timeout) {
        this.baseUrl = baseUrl.replaceAll("/$", "");
        this.secretKey = secretKey;
        this.clientId = clientId;

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
        com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<T>> responseType
    ) {
        try {
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
                TingeeApiResponse<T> apiResponse = objectMapper.readValue(responseBody, responseType);
                return apiResponse;
            }
        } catch (TingeeHttpError e) {
            throw e; // rethrow as-is (already RuntimeException)
        } catch (Exception e) {
            throw new TingeeApiException("API request failed: " + e.getMessage(), e);
        }
    }

    /**
     * Execute HTTP request for endpoints that return raw data (not wrapped in TingeeApiResponse)
     */
    public <T> T requestRaw(
        String method,
        String path,
        Object body,
        Map<String, String> queryParams,
        com.fasterxml.jackson.core.type.TypeReference<T> responseType
    ) {
        try {
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
                return objectMapper.readValue(responseBody, responseType);
            }
        } catch (TingeeHttpError e) {
            throw e; // rethrow as-is
        } catch (Exception e) {
            throw new TingeeApiException("API request failed: " + e.getMessage(), e);
        }
    }
}

