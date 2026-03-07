package vn.tingee.sdk.client;

/**
 * Configuration options for TingeeClient.
 *
 * <p>Usage:
 * <pre>{@code
 * TingeeClientOptions options = TingeeClientOptions
 *     .builder(secretKey, clientId)
 *     .environment(TingeeEnvironment.SANDBOX)
 *     .build();
 * }</pre>
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

    /**
     * Creates a new builder with the two required credentials.
     *
     * @param secretKey your Tingee secret key (required)
     * @param clientId  your Tingee client ID (required)
     */
    public static Builder builder(String secretKey, String clientId) {
        return new Builder(secretKey, clientId);
    }

    public static class Builder {
        private final String secretKey;
        private final String clientId;
        private TingeeEnvironment environment;
        private Integer timeout;
        private String baseUrl;

        private Builder(String secretKey, String clientId) {
            if (secretKey == null || secretKey.isEmpty()) {
                throw new IllegalArgumentException("secretKey is required");
            }
            if (clientId == null || clientId.isEmpty()) {
                throw new IllegalArgumentException("clientId is required");
            }
            this.secretKey = secretKey;
            this.clientId = clientId;
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
            return new TingeeClientOptions(this);
        }
    }
}

