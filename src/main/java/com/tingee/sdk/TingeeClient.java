package com.tingee.sdk;

import com.tingee.sdk.client.TingeeClientOptions;
import com.tingee.sdk.client.TingeeEnvironment;
import com.tingee.sdk.client.TingeeHttpClient;
import com.tingee.sdk.signature.TingeeSigner;
import com.tingee.sdk.types.TingeeApiResponse;
import java.util.HashMap;
import java.util.Map;
import com.tingee.sdk.model.*;
import java.util.List;
import java.time.LocalDateTime;

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
    private final String secretKey;

    TingeeHttpClient getHttpClient() {
        return httpClient;
    }

    public final TingeeClientCustomV1 v1Custom;

    public TingeeClient(TingeeClientOptions options) {
        this.baseUrl = options.getBaseUrl();
        this.secretKey = options.getSecretKey();
        this.httpClient = new TingeeHttpClient(
            baseUrl,
            options.getSecretKey(),
            options.getClientId(),
            options.getTimeout()
        );
        // <generated-versions-init>
        this.v1 = new V1(httpClient);
        // </generated-versions-init>
        v1Custom = new TingeeClientCustomV1(httpClient);
    }

    public static TingeeClientBuilder builder() {
        return new TingeeClientBuilder();
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Verify an incoming Tingee webhook signature using the secretKey
     * already configured on this client instance.
     *
     * @param signature  Value of x-signature header
     * @param timestamp  Value of x-request-timestamp header
     * @param body       Parsed webhook body as a Map
     */
    public TingeeSigner.WebhookVerifyResult verifyWebhookSignature(
            String signature,
            String timestamp,
            java.util.Map<String, Object> body) {
        return TingeeSigner.verifyWebhookSignature(secretKey, signature, timestamp, body);
    }

    // <generated-methods-begin>
    // Auto-generated from openapi/sdk.json — DO NOT EDIT MANUALLY
    // Regenerate using: npm run ge:java

    /** All V1 API methods. Usage: client.v1.methodName(...) */
    public V1 v1;

    public class V1 {
        private final TingeeHttpClient httpClient;
        V1(TingeeHttpClient httpClient) { this.httpClient = httpClient; }

    /**
     * generateVietQR
     */
    public TingeeApiResponse<GenerateVietQROuputDto> generateVietQr(OpenApiGenerateVietQRInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/generate-viet-qr", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<GenerateVietQROuputDto>>() {});
    }

    /**
     * generateDynamicQR
     */
    public TingeeApiResponse<GenerateDynamicQROuputDto> generateDynamicQr(GenerateDynamicQRInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/generate-dynamic-qr", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<GenerateDynamicQROuputDto>>() {});
    }

    /**
     * deleteDynamicQR
     */
    public TingeeApiResponse<EmptyDto> deleteDynamicQr(OpenApiDeleteDynamicQRInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/delete-dynamic-qr", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * getStatusDynamicQR
     */
    public TingeeApiResponse<OpenApiGetStatusDynamicQROutputDto> getStatusDynamicQr(OpenApiGetStatusDynamicQRInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/get-status-dynamic-qr", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiGetStatusDynamicQROutputDto>>() {});
    }

    /**
     * getBanks
     */
    public List<Bank> getBanks() throws Exception {
        return httpClient.requestRaw("GET", "/v1/get-banks", null, null, new com.fasterxml.jackson.core.type.TypeReference<List<Bank>>() {});
    }

    /**
     * getVAPaging
     */
    public TingeeApiResponse<PagedResultDto<OpenApiGetVAPagedOuputDto>> getVaPaging(OpenApiGetVAPagedInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/get-va-paging", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<OpenApiGetVAPagedOuputDto>>>() {});
    }

    /**
     * getAccountNumberByQRCode
     */
    public TingeeApiResponse<PagedResultDto<OpenApiGenerateVietQROuputDto>> getAccountNumberInfoByQrCode(String qrcode) throws Exception {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("qrcode", String.valueOf(qrcode));
        return httpClient.request("POST", "/v1/get-account-number-info-by-qr-code", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<OpenApiGenerateVietQROuputDto>>>() {});
    }

    /**
     * createVA
     */
    public TingeeApiResponse<BankCreateVAOuputDto> createVa(OpenApiCreateVAInpuDto body) throws Exception {
        return httpClient.request("POST", "/v1/create-va", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<BankCreateVAOuputDto>>() {});
    }

    /**
     * createVAAdvanced
     */
    public TingeeApiResponse<BankCreateVAOuputDto> createVaAdvanced(OpenApiCreateVAInpuDto body) throws Exception {
        return httpClient.request("POST", "/v1/create-va-advanced", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<BankCreateVAOuputDto>>() {});
    }

    /**
     * confirmVA
     */
    public TingeeApiResponse<OpenApiConfirmVAOuputDto> confirmVa(OpenApiBankConfirmVAInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/confirm-va", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiConfirmVAOuputDto>>() {});
    }

    /**
     * deleteVA
     */
    public TingeeApiResponse<BankDeleteVAOutputDto> deleteVa(String bankbin, String bankname, String vaaccountnumber, Double merchantid) throws Exception {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("bankbin", String.valueOf(bankbin));
        queryParams.put("bankname", String.valueOf(bankname));
        queryParams.put("vaaccountnumber", String.valueOf(vaaccountnumber));
        queryParams.put("merchantid", String.valueOf(merchantid));
        return httpClient.request("POST", "/v1/delete-va", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<BankDeleteVAOutputDto>>() {});
    }

    /**
     * confirmDeleteVA
     */
    public TingeeApiResponse<EmptyDto> confirmDeleteVa(OpenApiBankConfirmVAInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/confirm-delete-va", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * registerNotify
     */
    public TingeeApiResponse<BankDeleteVAOutputDto> registerNotify(OpenApiRegisterNotifyDto body) throws Exception {
        return httpClient.request("POST", "/v1/register-notify", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<BankDeleteVAOutputDto>>() {});
    }

    /**
     * confirmRegisterNotify
     */
    public TingeeApiResponse<BankDeleteVAOutputDto> confirmRegisterNotify(OpenApiBankConfirmVAInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/confirm-register-notify", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<BankDeleteVAOutputDto>>() {});
    }

    /**
     * refund
     */
    public TingeeApiResponse<EmptyDto> refund(OpenApiRefundDto body) throws Exception {
        return httpClient.request("POST", "/v1/refund", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * DeviceController_readSecurityCode
     */
    public TingeeApiResponse<EmptyDto> deviceReadSecurityCode(OpenApiReadSecurityCodeDto body) throws Exception {
        return httpClient.request("POST", "/v1/device/read-security-code", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * DeviceController_readPartnerSecurityCode
     */
    public TingeeApiResponse<EmptyDto> deviceReadPartnerSecurityCode(OpenApiReadPartnerSecurityCodeDto body) throws Exception {
        return httpClient.request("POST", "/v1/device/read-partner-security-code", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * DeviceController_addDeviceToShop
     */
    public TingeeApiResponse<List<SendNotifyTingeeBoxDto>> deviceAddDeviceToShop(OpenApiAddDeviceToShop body) throws Exception {
        return httpClient.request("POST", "/v1/device/add-device-to-shop", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<List<SendNotifyTingeeBoxDto>>>() {});
    }

    /**
     * DeviceController_updateShopDeviceLinkStatus
     */
    public TingeeApiResponse<EmptyDto> deviceUpdateShopDeviceLinkStatus(OpenApiUpdateShopDeviceLinkDto body) throws Exception {
        return httpClient.request("POST", "/v1/device/update-shop-device-link-status", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * DeviceController_publishReadAmount
     */
    public TingeeApiResponse<EmptyDto> deviceReadAmount(BIDVOpenApiReadAmountDto body) throws Exception {
        return httpClient.request("POST", "/v1/device/read-amount", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * DeviceController_publishReadAmountLinkToMerchant
     */
    public TingeeApiResponse<EmptyDto> deviceReadAmountLinkToMerchant(OpenApiReadAmountDto body) throws Exception {
        return httpClient.request("POST", "/v1/device/read-amount-link-to-merchant", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * DeviceController_showQRCode
     */
    public TingeeApiResponse<EmptyDto> deviceShowQrCode(OpenApiShowQRCodeDto body) throws Exception {
        return httpClient.request("POST", "/v1/device/show-qr-code", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * DeviceController_showDynamicQRCode
     */
    public TingeeApiResponse<EmptyDto> deviceShowDynamicQrCode(OpenApiShowQRCodeDto body) throws Exception {
        return httpClient.request("POST", "/v1/device/show-dynamic-qr-code", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * DeviceController_showStaticQRCode
     */
    public TingeeApiResponse<EmptyDto> deviceShowStaticQrCode(OpenApiShowQRCodeDto body) throws Exception {
        return httpClient.request("POST", "/v1/device/show-static-qr-code", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * DeviceController_getDevicesInShop
     */
    public TingeeApiResponse<List<SendNotifyTingeeBoxDto>> deviceGetDevicesLinkToShopOrVa(OpenApiGetDevicesLinkToShopOrVA body) throws Exception {
        return httpClient.request("POST", "/v1/device/get-devices-link-to-shop-or-va", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<List<SendNotifyTingeeBoxDto>>>() {});
    }

    /**
     * DeviceController_getPaging
     */
    public TingeeApiResponse<PagedResultDto<DeviceDto>> deviceGetPaging(OpenApiGetPagingDeviceInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/device/get-paging", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<DeviceDto>>>() {});
    }

    /**
     * DeviceController_reset
     */
    public TingeeApiResponse<String> deviceReset(String uuid) throws Exception {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("uuid", String.valueOf(uuid));
        return httpClient.request("DELETE", "/v1/device/reset", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<String>>() {});
    }

    /**
     * UserController_verifyReferralCode
     */
    public TingeeApiResponse<OpenApiVerifyReferralCodeResponseDto> userVerifyReferralCode(String referralcode) throws Exception {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("referralcode", String.valueOf(referralcode));
        return httpClient.request("POST", "/v1/user/verify-referral-code", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiVerifyReferralCodeResponseDto>>() {});
    }

    /**
     * ShopController_create
     */
    public TingeeApiResponse<OpenApiCreateOrUpdateShopOutputDto> shopCreateOrUpdate(OpenApiCreateOrUpdateShopDto body) throws Exception {
        return httpClient.request("POST", "/v1/shop/create-or-update", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiCreateOrUpdateShopOutputDto>>() {});
    }

    /**
     * ShopController_getShopPaging
     */
    public TingeeApiResponse<PagedResultDto<OpenApiGetShopPagedOuputDto>> shopGetPaging(OpenApiGetShopPagedInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/shop/get-paging", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<OpenApiGetShopPagedOuputDto>>>() {});
    }

    /**
     * DeepLinkController_deepLink
     */
    public TingeeApiResponse<String> deepLinkGenerate(OpenApiDeepLinkDto body) throws Exception {
        return httpClient.request("POST", "/v1/deep-link/generate", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<String>>() {});
    }

    /**
     * AccountNumberController_getAllDDL
     */
    public TingeeApiResponse<List<V2AccountNumberDDLDto>> accountNumberGetAllDdl(OpenApiAccountNumberDDLPagedInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/account-number/get-all-ddl", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<List<V2AccountNumberDDLDto>>>() {});
    }

    /**
     * TransactionController_getShopPaging
     */
    public TingeeApiResponse<PagedResultDto<OpenApiTransactionPagedOuputDto>> transactionGetPaging(OpenApiTransactionPagedInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/transaction/get-paging", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<OpenApiTransactionPagedOuputDto>>>() {});
    }

    /**
     * MerchantController_getPagingConfig
     */
    public TingeeApiResponse<PagedResultDto<MerchantBankConfigPagedOutputDto>> merchantGetPagingConfig(OpenApiMerchantBankConfigPagedInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/merchant/get-paging-config", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<MerchantBankConfigPagedOutputDto>>>() {});
    }

    /**
     * MerchantController_createOrUpdateConfig
     */
    public TingeeApiResponse<java.lang.Number> merchantCreateOrUpdateConfig(OpenApiBankCreateOrUpdateConfigDto body) throws Exception {
        return httpClient.request("POST", "/v1/merchant/create-or-update-config", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<java.lang.Number>>() {});
    }

    /**
     * MerchantController_deleteConfig
     */
    public TingeeApiResponse<java.lang.Number> merchantDeleteConfig(OpenApiDeleteConfigDto body) throws Exception {
        return httpClient.request("POST", "/v1/merchant/delete-config", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<java.lang.Number>>() {});
    }

    /**
     * MerchantController_configAccountBusinessForACB
     */
    public TingeeApiResponse<OpenApiCreateBankVAOutputDto> merchantConfigAccountBusiness(OpenApiConfigAccountBusinessDto body) throws Exception {
        return httpClient.request("POST", "/v1/merchant/config-account-business", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiCreateBankVAOutputDto>>() {});
    }

    /**
     * MerchantController_deleteConfigAccountBusiness
     */
    public TingeeApiResponse<Object> merchantDeleteConfigAccountBusiness(OpenApiDeleteConfigBusinessDto body) throws Exception {
        return httpClient.request("POST", "/v1/merchant/delete-config-account-business", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<Object>>() {});
    }

    /**
     * MerchantController_createMerchant
     */
    public TingeeApiResponse<java.lang.Number> merchantCreate(OpenApiCreateMerchantDto body) throws Exception {
        return httpClient.request("POST", "/v1/merchant/create", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<java.lang.Number>>() {});
    }

    /**
     * MerchantController_getPagingMerchants
     */
    public TingeeApiResponse<PagedResultDto<MerchantDto>> merchantGetPaging(OpenApiGetPagingMerchantsDto body) throws Exception {
        return httpClient.request("POST", "/v1/merchant/get-paging", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<MerchantDto>>>() {});
    }

    /**
     * MerchantController_delete
     */
    public TingeeApiResponse<EmptyDto> merchantDelete(Double merchantid) throws Exception {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("merchantid", String.valueOf(merchantid));
        return httpClient.request("DELETE", "/v1/merchant/delete", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
    }

    /**
     * DirectDebitController_getRegisterUrl
     */
    public TingeeApiResponse<String> directDebitRegister(OpenApiRegisterDto body) throws Exception {
        return httpClient.request("POST", "/v1/direct-debit/register", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<String>>() {});
    }

    /**
     * DirectDebitController_paymentBill
     */
    public TingeeApiResponse<PaymentBillResponseDto> directDebitPaymentBill(OpenApiPaymentBillDto body) throws Exception {
        return httpClient.request("POST", "/v1/direct-debit/payment-bill", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PaymentBillResponseDto>>() {});
    }

    /**
     * DirectDebitController_deleteToken
     */
    public TingeeApiResponse<DeleteSubscriptionOutputDto> directDebitDeleteSubscription(OpenApiDeleteSubscriptionDto body) throws Exception {
        return httpClient.request("DELETE", "/v1/direct-debit/delete-subscription", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<DeleteSubscriptionOutputDto>>() {});
    }

    /**
     * DirectDebitController_refund
     */
    public TingeeApiResponse<RefundOutputDto> directDebitRefund(OpenApiRefundInputDto body) throws Exception {
        return httpClient.request("POST", "/v1/direct-debit/refund", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<RefundOutputDto>>() {});
    }

    /**
     * DirectDebitController_getEditConfirmPaymentMethodUrl
     */
    public TingeeApiResponse<String> directDebitEditConfirmPaymentMethod(OpenApiEditConfirmBeforePaymentMethodDto body) throws Exception {
        return httpClient.request("PUT", "/v1/direct-debit/edit-confirm-payment-method", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<String>>() {});
    }

    /**
     * DirectDebitController_getPaymentSubscriptionStatus
     */
    public TingeeApiResponse<OpenApiSubscriptionStatusResponseDto> directDebitGetSubscriptionStatus(String requestid, String subscriptionid, String tokenref) throws Exception {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("requestid", String.valueOf(requestid));
        queryParams.put("subscriptionid", String.valueOf(subscriptionid));
        queryParams.put("tokenref", String.valueOf(tokenref));
        return httpClient.request("GET", "/v1/direct-debit/get-subscription-status", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiSubscriptionStatusResponseDto>>() {});
    }

    /**
     * DirectDebitController_getPaymentTransactionStatus
     */
    public TingeeApiResponse<OpenApiPaymentTransactionStatusResponseDto> directDebitGetTransactionStatus(String transactionid, String tokenref, String subscriptionid) throws Exception {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("transactionid", String.valueOf(transactionid));
        queryParams.put("tokenref", String.valueOf(tokenref));
        queryParams.put("subscriptionid", String.valueOf(subscriptionid));
        return httpClient.request("GET", "/v1/direct-debit/get-transaction-status", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiPaymentTransactionStatusResponseDto>>() {});
    }

    /**
     * DirectDebitController_getPagingTransactions
     */
    public TingeeApiResponse<PagedResultDto<OpenApiPaymentTransactionsPagedOutputDto>> directDebitGetPagingTransactions(String subscriptionid, String tokenref, LocalDateTime starttime, LocalDateTime endtime, Double skipcount, Double maxresultcount) throws Exception {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("subscriptionid", String.valueOf(subscriptionid));
        queryParams.put("tokenref", String.valueOf(tokenref));
        queryParams.put("starttime", String.valueOf(starttime));
        queryParams.put("endtime", String.valueOf(endtime));
        queryParams.put("skipcount", String.valueOf(skipcount));
        queryParams.put("maxresultcount", String.valueOf(maxresultcount));
        return httpClient.request("GET", "/v1/direct-debit/get-paging-transactions", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<OpenApiPaymentTransactionsPagedOutputDto>>>() {});
    }
    }

    // <generated-methods-end>

    public static class TingeeClientBuilder {
        private String secretKey;
        private String clientId;
        private TingeeEnvironment environment;
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
