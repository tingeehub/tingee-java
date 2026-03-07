package vn.tingee.sdk.client;

/**
 * Unchecked exception thrown when a Tingee API request fails due to
 * network errors, serialization issues, or unexpected server responses.
 *
 * <p>Unlike checked exceptions, you are NOT required to wrap API calls
 * in try-catch. Handle this exception at a higher level if needed:
 * <pre>{@code
 * try {
 *     var result = tingeeClient.merchant.getPaging(request);
 * } catch (TingeeHttpError e) {
 *     // HTTP 4xx/5xx from server
 * } catch (TingeeApiException e) {
 *     // Network or serialization failure
 * }
 * }</pre>
 */
public class TingeeApiException extends RuntimeException {

    public TingeeApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public TingeeApiException(String message) {
        super(message);
    }
}

