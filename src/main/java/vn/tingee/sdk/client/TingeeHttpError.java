package vn.tingee.sdk.client;

/**
 * HTTP-level error from Tingee API
 */
public class TingeeHttpError extends RuntimeException {
    private final int statusCode;
    private final String responseBody;

    public TingeeHttpError(String message, int statusCode, String responseBody) {
        super(message);
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getResponseBody() {
        return responseBody;
    }
}

