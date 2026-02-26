package com.tingee.sdk;

import com.tingee.sdk.client.TingeeClientOptions;
import com.tingee.sdk.client.TingeeHttpClient;
import com.tingee.sdk.types.TingeeApiResponse;
import java.util.HashMap;
import java.util.Map;
import com.tingee.sdk.model.*;

/**
 * Main client class for Tingee API
 * 
 * @example
 * <pre>{@code
 * TingeeClient client = TingeeClient.builder()
 *     .secretKey("your-secret-key")
 *     .clientId("your-client-id")
 *     .environment(TingeeEnvironment.PRODUCTION)
 *     .timeout(90000)
 *     .build();
 * 
 * TingeeApiResponse<SomeData> result = client.someMethod(...);
 * }</pre>
 */
public class TingeeClient {
    private final TingeeHttpClient httpClient;
    private final String baseUrl;

    TingeeHttpClient getHttpClient() {
        return httpClient;
    }

    public TingeeClient(TingeeClientOptions options) {
        this.baseUrl = options.getBaseUrl();
        this.httpClient = new TingeeHttpClient(
            baseUrl,
            options.getSecretKey(),
            options.getClientId(),
            options.getTimeout()
        );
    }

    public static TingeeClientBuilder builder() {
        return new TingeeClientBuilder();
    }

    public String getBaseUrl() {
        return baseUrl;
    }

        // Auto-generated methods from openapi/sdk.json
    // DO NOT EDIT MANUALLY - Regenerate using: npm run generate:java

    /**
     * UserController_verifyReferralCode
     */
    public TingeeApiResponse<Object> userVerifyReferralCode(String referralcode) {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("referralcode", String.valueOf(referralcode));
        return httpClient.request("POST", "/v1/user/verify-referral-code", null, queryParams, Object.class);
    }

    /**
     * ShopController_getShopPaging
     */
    public TingeeApiResponse<Object> shopGetPaging(OpenApiGetShopPagedInputDto body) {
        return httpClient.request("POST", "/v1/shop/get-paging", body, null, Object.class);
    }

    /**
     * MerchantController_getPagingConfig
     */
    public TingeeApiResponse<Object> merchantGetPagingConfig(OpenApiMerchantBankConfigPagedInputDto body) {
        return httpClient.request("POST", "/v1/merchant/get-paging-config", body, null, Object.class);
    }

    /**
     * MerchantController_createOrUpdateConfig
     */
    public TingeeApiResponse<Object> merchantCreateOrUpdateConfig(OpenApiBankCreateOrUpdateConfigDto body) {
        return httpClient.request("POST", "/v1/merchant/create-or-update-config", body, null, Object.class);
    }

    /**
     * MerchantController_deleteConfig
     */
    public TingeeApiResponse<Object> merchantDeleteConfig(OpenApiDeleteConfigDto body) {
        return httpClient.request("POST", "/v1/merchant/delete-config", body, null, Object.class);
    }

    /**
     * MerchantController_configAccountBusinessForACB
     */
    public TingeeApiResponse<OpenApiCreateBankVAOutputDto> merchantConfigAccountBusiness(OpenApiConfigAccountBusinessDto body) {
        return httpClient.request("POST", "/v1/merchant/config-account-business", body, null, OpenApiCreateBankVAOutputDto.class);
    }

    /**
     * MerchantController_deleteConfigAccountBusiness
     */
    public TingeeApiResponse<Object> merchantDeleteConfigAccountBusiness(OpenApiDeleteConfigBusinessDto body) {
        return httpClient.request("POST", "/v1/merchant/delete-config-account-business", body, null, Object.class);
    }

    /**
     * MerchantController_createMerchant
     */
    public TingeeApiResponse<Object> merchantCreate(OpenApiCreateMerchantDto body) {
        return httpClient.request("POST", "/v1/merchant/create", body, null, Object.class);
    }

    /**
     * MerchantController_getPagingMerchants
     */
    public TingeeApiResponse<Object> merchantGetPaging(OpenApiGetPagingMerchantsDto body) {
        return httpClient.request("POST", "/v1/merchant/get-paging", body, null, Object.class);
    }

    /**
     * MerchantController_delete
     */
    public TingeeApiResponse<Object> merchantDelete(Double merchantid) {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("merchantid", String.valueOf(merchantid));
        return httpClient.request("DELETE", "/v1/merchant/delete", null, queryParams, Object.class);
    }

    public static class TingeeClientBuilder {
        private String secretKey;
        private String clientId;
        private com.tingee.sdk.client.TingeeEnvironment environment;
        private Integer timeout;
        private String baseUrl;

        public TingeeClientBuilder secretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        public TingeeClientBuilder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public TingeeClientBuilder environment(com.tingee.sdk.client.TingeeEnvironment environment) {
            this.environment = environment;
            return this;
        }

        public TingeeClientBuilder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public TingeeClientBuilder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public TingeeClient build() {
            com.tingee.sdk.client.TingeeClientOptions.Builder optionsBuilder = 
                com.tingee.sdk.client.TingeeClientOptions.builder()
                    .secretKey(secretKey)
                    .clientId(clientId);
            
            if (environment != null) {
                optionsBuilder.environment(environment);
            }
            if (timeout != null) {
                optionsBuilder.timeout(timeout);
            }
            if (baseUrl != null) {
                optionsBuilder.baseUrl(baseUrl);
            }
            
            return new TingeeClient(optionsBuilder.build());
        }
    }
}
