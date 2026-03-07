package vn.tingee.sdk.client;

/**
 * Tingee API environment
 */
public enum TingeeEnvironment {
    PRODUCTION("https://open-api.tingee.vn"),
    UAT("https://uat-open-api.tingee.vn");

    private final String baseUrl;

    TingeeEnvironment(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}

