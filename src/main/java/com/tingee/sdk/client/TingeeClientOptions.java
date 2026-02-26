package com.tingee.sdk.client;

/**
 * Configuration options for TingeeClient
 */
public class TingeeClientOptions {
    private final String secretKey;
    private final String clientId;
    private TingeeEnvironment environment;
    private Integer timeout;
    private String baseUrl;

    private TingeeClientOptions(Builder builder) {
        this.secretKey = builder.secretKey;
        this.clientId = builder.clientId;
        this.environment = builder.environment;
        this.timeout = builder.timeout;
        this.baseUrl = builder.baseUrl;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public String getClientId() {
        return clientId;
    }

    public TingeeEnvironment getEnvironment() {
        return environment != null ? environment : TingeeEnvironment.PRODUCTION;
    }

    public Integer getTimeout() {
        return timeout != null ? timeout : 90000;
    }

    public String getBaseUrl() {
        if (baseUrl != null) {
            return baseUrl;
        }
        return getEnvironment().getBaseUrl();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String secretKey;
        private String clientId;
        private TingeeEnvironment environment;
        private Integer timeout;
        private String baseUrl;

        public Builder secretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder environment(TingeeEnvironment environment) {
            this.environment = environment;
            return this;
        }

        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public TingeeClientOptions build() {
            if (secretKey == null || secretKey.isEmpty()) {
                throw new IllegalArgumentException("secretKey is required");
            }
            if (clientId == null || clientId.isEmpty()) {
                throw new IllegalArgumentException("clientId is required");
            }
            return new TingeeClientOptions(this);
        }
    }
}
