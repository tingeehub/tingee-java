package vn.tingee.sdk;

import vn.tingee.sdk.client.TingeeClientOptions;
import vn.tingee.sdk.client.TingeeEnvironment;
import vn.tingee.sdk.client.TingeeHttpClient;
import vn.tingee.sdk.signature.TingeeSigner;
import vn.tingee.sdk.types.TingeeApiResponse;
import vn.tingee.sdk.types.TingeeWebhookBody;
import java.util.HashMap;
import java.util.Map;
import vn.tingee.sdk.model.*;
import java.util.List;
import java.time.LocalDateTime;

/**
 * Main client class for Tingee API
 *
 * @example
 * <pre>{@code
 * TingeeClient client = TingeeClient.builder("your-secret-key", "your-client-id")
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

    public TingeeClient(TingeeClientOptions options) {
        this.baseUrl = options.getBaseUrl();
        this.secretKey = options.getSecretKey();
        this.httpClient = new TingeeHttpClient(
            baseUrl,
            options.getSecretKey(),
            options.getClientId(),
            options.getTimeout()
        );
        // <generated-groups-init>
        this.bank = new BankGroup(this.httpClient);
        this.device = new DeviceGroup(this.httpClient);
        this.user = new UserGroup(this.httpClient);
        this.shop = new ShopGroup(this.httpClient);
        this.deepLink = new DeepLinkGroup(this.httpClient);
        this.accountNumber = new AccountNumberGroup(this.httpClient);
        this.transaction = new TransactionGroup(this.httpClient);
        this.merchant = new MerchantGroup(this.httpClient);
        this.directDebit = new DirectDebitGroup(this.httpClient);
        // </generated-groups-init>
    }

    /**
     * Creates a new builder with the two required credentials.
     *
     * @param secretKey your Tingee secret key (required)
     * @param clientId  your Tingee client ID (required)
     */
    public static TingeeClientBuilder builder(String secretKey, String clientId) {
        return new TingeeClientBuilder(secretKey, clientId);
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
     * @param body       Parsed webhook body as TingeeWebhookBody
     */
    public TingeeSigner.WebhookVerifyResult verifyWebhookSignature(
            String signature,
            String timestamp,
            TingeeWebhookBody body) {
        return TingeeSigner.verifyWebhookSignature(secretKey, signature, timestamp, body);
    }

    /**
     * Verify an incoming Tingee webhook signature.
     * body can be passed as a raw JSON string â€” it will be parsed automatically.
     */
    public TingeeSigner.WebhookVerifyResult verifyWebhookSignature(
            String signature,
            String timestamp,
            String bodyJson) {
        return TingeeSigner.verifyWebhookSignature(secretKey, signature, timestamp, bodyJson);
    }

    // <generated-methods-begin>
    // Auto-generated from openapi/sdk.json — DO NOT EDIT MANUALLY
    // Regenerate using: npm run ge:java

    public final BankGroup bank;

    public class BankGroup {
        private final vn.tingee.sdk.client.TingeeHttpClient httpClient;
        public BankGroup(vn.tingee.sdk.client.TingeeHttpClient httpClient) { this.httpClient = httpClient; }

    /**
         * generateVietQR
         */
        public TingeeApiResponse<GenerateVietQROuputDto> generateVietQr(OpenApiGenerateVietQRInputDto body) {
            return httpClient.request("POST", "/v1/bank/generate-viet-qr", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<GenerateVietQROuputDto>>() {});
        }

    /**
         * generateDynamicQR
         */
        public TingeeApiResponse<GenerateDynamicQROuputDto> generateDynamicQr(GenerateDynamicQRInputDto body) {
            return httpClient.request("POST", "/v1/bank/generate-dynamic-qr", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<GenerateDynamicQROuputDto>>() {});
        }

    /**
         * deleteDynamicQR
         */
        public TingeeApiResponse<EmptyDto> deleteDynamicQr(OpenApiDeleteDynamicQRInputDto body) {
            return httpClient.request("POST", "/v1/bank/delete-dynamic-qr", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }

    /**
         * getStatusDynamicQR
         */
        public TingeeApiResponse<OpenApiGetStatusDynamicQROutputDto> getStatusDynamicQr(OpenApiGetStatusDynamicQRInputDto body) {
            return httpClient.request("POST", "/v1/bank/get-status-dynamic-qr", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiGetStatusDynamicQROutputDto>>() {});
        }

    /**
         * getBanks
         */
        public TingeeApiResponse<Bank> getBanks() {
            return httpClient.request("GET", "/v1/bank/get-banks", null, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<Bank>>() {});
        }

    /**
         * getVAPaging
         */
        public TingeeApiResponse<PagedResultDto<OpenApiGetVAPagedOuputDto>> getVaPaging(OpenApiGetVAPagedInputDto body) {
            return httpClient.request("POST", "/v1/bank/get-va-paging", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<OpenApiGetVAPagedOuputDto>>>() {});
        }

    /**
         * getAccountNumberByQRCode
         */
        public TingeeApiResponse<PagedResultDto<OpenApiGenerateVietQROuputDto>> getAccountNumberInfoByQrCode(String qrCode) {
            Map<String, String> queryParams = new HashMap<>();
            queryParams.put("qrCode", String.valueOf(qrCode));
            return httpClient.request("POST", "/v1/bank/get-account-number-info-by-qr-code", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<OpenApiGenerateVietQROuputDto>>>() {});
        }

    /**
         * createVA
         */
        public TingeeApiResponse<BankCreateVAOuputDto> createVa(OpenApiCreateVAInpuDto body) {
            return httpClient.request("POST", "/v1/bank/create-va", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<BankCreateVAOuputDto>>() {});
        }

    /**
         * createVAAdvanced
         */
        public TingeeApiResponse<BankCreateVAOuputDto> createVaAdvanced(OpenApiCreateVAInpuDto body) {
            return httpClient.request("POST", "/v1/bank/create-va-advanced", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<BankCreateVAOuputDto>>() {});
        }

    /**
         * confirmVA
         */
        public TingeeApiResponse<OpenApiConfirmVAOuputDto> confirmVa(OpenApiBankConfirmVAInputDto body) {
            return httpClient.request("POST", "/v1/bank/confirm-va", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiConfirmVAOuputDto>>() {});
        }

    /**
         * deleteVA
         */
        public TingeeApiResponse<BankDeleteVAOutputDto> deleteVa(String bankBin, BankNameEnum bankName, String vaAccountNumber, Integer merchantId) {
            Map<String, String> queryParams = new HashMap<>();
            queryParams.put("bankBin", String.valueOf(bankBin));
            queryParams.put("bankName", String.valueOf(bankName));
            queryParams.put("vaAccountNumber", String.valueOf(vaAccountNumber));
            queryParams.put("merchantId", String.valueOf(merchantId));
            return httpClient.request("POST", "/v1/bank/delete-va", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<BankDeleteVAOutputDto>>() {});
        }

    /**
         * confirmDeleteVA
         */
        public TingeeApiResponse<EmptyDto> confirmDeleteVa(OpenApiBankConfirmVAInputDto body) {
            return httpClient.request("POST", "/v1/bank/confirm-delete-va", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }

    /**
         * registerNotify
         */
        public TingeeApiResponse<BankDeleteVAOutputDto> registerNotify(OpenApiRegisterNotifyDto body) {
            return httpClient.request("POST", "/v1/bank/register-notify", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<BankDeleteVAOutputDto>>() {});
        }

    /**
         * confirmRegisterNotify
         */
        public TingeeApiResponse<BankDeleteVAOutputDto> confirmRegisterNotify(OpenApiBankConfirmVAInputDto body) {
            return httpClient.request("POST", "/v1/bank/confirm-register-notify", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<BankDeleteVAOutputDto>>() {});
        }

    /**
         * refund
         */
        public TingeeApiResponse<EmptyDto> refund(OpenApiRefundDto body) {
            return httpClient.request("POST", "/v1/bank/refund", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }
    }

    public final DeviceGroup device;

    public class DeviceGroup {
        private final vn.tingee.sdk.client.TingeeHttpClient httpClient;
        public DeviceGroup(vn.tingee.sdk.client.TingeeHttpClient httpClient) { this.httpClient = httpClient; }

    /**
         * DeviceController_readSecurityCode
         */
        public TingeeApiResponse<EmptyDto> readSecurityCode(OpenApiReadSecurityCodeDto body) {
            return httpClient.request("POST", "/v1/device/read-security-code", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }

    /**
         * DeviceController_readPartnerSecurityCode
         */
        public TingeeApiResponse<EmptyDto> readPartnerSecurityCode(OpenApiReadPartnerSecurityCodeDto body) {
            return httpClient.request("POST", "/v1/device/read-partner-security-code", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }

    /**
         * DeviceController_addDeviceToShop
         */
        public TingeeApiResponse<List<SendNotifyTingeeBoxDto>> addDeviceToShop(OpenApiAddDeviceToShop body) {
            return httpClient.request("POST", "/v1/device/add-device-to-shop", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<List<SendNotifyTingeeBoxDto>>>() {});
        }

    /**
         * DeviceController_updateShopDeviceLinkStatus
         */
        public TingeeApiResponse<EmptyDto> updateShopDeviceLinkStatus(OpenApiUpdateShopDeviceLinkDto body) {
            return httpClient.request("POST", "/v1/device/update-shop-device-link-status", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }

    /**
         * DeviceController_publishReadAmount
         */
        public TingeeApiResponse<EmptyDto> readAmount(BIDVOpenApiReadAmountDto body) {
            return httpClient.request("POST", "/v1/device/read-amount", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }

    /**
         * DeviceController_publishReadAmountLinkToMerchant
         */
        public TingeeApiResponse<EmptyDto> readAmountLinkToMerchant(OpenApiReadAmountDto body) {
            return httpClient.request("POST", "/v1/device/read-amount-link-to-merchant", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }

    /**
         * DeviceController_showQRCode
         */
        public TingeeApiResponse<EmptyDto> showQrCode(OpenApiShowQRCodeDto body) {
            return httpClient.request("POST", "/v1/device/show-qr-code", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }

    /**
         * DeviceController_showDynamicQRCode
         */
        public TingeeApiResponse<EmptyDto> showDynamicQrCode(OpenApiShowQRCodeDto body) {
            return httpClient.request("POST", "/v1/device/show-dynamic-qr-code", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }

    /**
         * DeviceController_showStaticQRCode
         */
        public TingeeApiResponse<EmptyDto> showStaticQrCode(OpenApiShowQRCodeDto body) {
            return httpClient.request("POST", "/v1/device/show-static-qr-code", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }

    /**
         * DeviceController_getDevicesInShop
         */
        public TingeeApiResponse<List<SendNotifyTingeeBoxDto>> getDevicesLinkToShopOrVa(OpenApiGetDevicesLinkToShopOrVA body) {
            return httpClient.request("POST", "/v1/device/get-devices-link-to-shop-or-va", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<List<SendNotifyTingeeBoxDto>>>() {});
        }

    /**
         * DeviceController_getPaging
         */
        public TingeeApiResponse<PagedResultDto<DeviceDto>> getPaging(OpenApiGetPagingDeviceInputDto body) {
            return httpClient.request("POST", "/v1/device/get-paging", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<DeviceDto>>>() {});
        }

    /**
         * DeviceController_reset
         */
        public TingeeApiResponse<String> reset(String uuid) {
            Map<String, String> queryParams = new HashMap<>();
            queryParams.put("uuid", String.valueOf(uuid));
            return httpClient.request("DELETE", "/v1/device/reset", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<String>>() {});
        }

    /**
         * DeviceController_generateAndShowDynamicQrCode
         */
        public TingeeApiResponse<Object> generateAndShowDynamicQrCode(OpenApiGenerateAndShowDynamicQrCodeDto body) {
            return httpClient.request("POST", "/v1/device/generate-and-show-dynamic-qr-code", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<Object>>() {});
        }
    }

    public final UserGroup user;

    public class UserGroup {
        private final vn.tingee.sdk.client.TingeeHttpClient httpClient;
        public UserGroup(vn.tingee.sdk.client.TingeeHttpClient httpClient) { this.httpClient = httpClient; }

    /**
         * UserController_verifyReferralCode
         */
        public TingeeApiResponse<OpenApiVerifyReferralCodeResponseDto> verifyReferralCode(String referralCode) {
            Map<String, String> queryParams = new HashMap<>();
            queryParams.put("referralCode", String.valueOf(referralCode));
            return httpClient.request("POST", "/v1/user/verify-referral-code", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiVerifyReferralCodeResponseDto>>() {});
        }
    }

    public final ShopGroup shop;

    public class ShopGroup {
        private final vn.tingee.sdk.client.TingeeHttpClient httpClient;
        public ShopGroup(vn.tingee.sdk.client.TingeeHttpClient httpClient) { this.httpClient = httpClient; }

    /**
         * ShopController_create
         */
        public TingeeApiResponse<OpenApiCreateOrUpdateShopOutputDto> createOrUpdate(OpenApiCreateOrUpdateShopDto body) {
            return httpClient.request("POST", "/v1/shop/create-or-update", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiCreateOrUpdateShopOutputDto>>() {});
        }

    /**
         * ShopController_getShopPaging
         */
        public TingeeApiResponse<PagedResultDto<OpenApiGetShopPagedOuputDto>> getPaging(OpenApiGetShopPagedInputDto body) {
            return httpClient.request("POST", "/v1/shop/get-paging", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<OpenApiGetShopPagedOuputDto>>>() {});
        }
    }

    public final DeepLinkGroup deepLink;

    public class DeepLinkGroup {
        private final vn.tingee.sdk.client.TingeeHttpClient httpClient;
        public DeepLinkGroup(vn.tingee.sdk.client.TingeeHttpClient httpClient) { this.httpClient = httpClient; }

    /**
         * DeepLinkController_deepLink
         */
        public TingeeApiResponse<String> generate(OpenApiDeepLinkDto body) {
            return httpClient.request("POST", "/v1/deep-link/generate", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<String>>() {});
        }
    }

    public final AccountNumberGroup accountNumber;

    public class AccountNumberGroup {
        private final vn.tingee.sdk.client.TingeeHttpClient httpClient;
        public AccountNumberGroup(vn.tingee.sdk.client.TingeeHttpClient httpClient) { this.httpClient = httpClient; }

    /**
         * AccountNumberController_getAllDDL
         */
        public TingeeApiResponse<List<V2AccountNumberDDLDto>> getAllDdl(OpenApiAccountNumberDDLPagedInputDto body) {
            return httpClient.request("POST", "/v1/account-number/get-all-ddl", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<List<V2AccountNumberDDLDto>>>() {});
        }
    }

    public final TransactionGroup transaction;

    public class TransactionGroup {
        private final vn.tingee.sdk.client.TingeeHttpClient httpClient;
        public TransactionGroup(vn.tingee.sdk.client.TingeeHttpClient httpClient) { this.httpClient = httpClient; }

    /**
         * TransactionController_getShopPaging
         */
        public TingeeApiResponse<PagedResultDto<OpenApiTransactionPagedOuputDto>> getPaging(OpenApiTransactionPagedInputDto body) {
            return httpClient.request("POST", "/v1/transaction/get-paging", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<OpenApiTransactionPagedOuputDto>>>() {});
        }
    }

    public final MerchantGroup merchant;

    public class MerchantGroup {
        private final vn.tingee.sdk.client.TingeeHttpClient httpClient;
        public MerchantGroup(vn.tingee.sdk.client.TingeeHttpClient httpClient) { this.httpClient = httpClient; }

    /**
         * MerchantController_getPagingConfig
         */
        public TingeeApiResponse<PagedResultDto<MerchantBankConfigPagedOutputDto>> getPagingConfig(OpenApiMerchantBankConfigPagedInputDto body) {
            return httpClient.request("POST", "/v1/merchant/get-paging-config", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<MerchantBankConfigPagedOutputDto>>>() {});
        }

    /**
         * MerchantController_createOrUpdateConfig
         */
        public TingeeApiResponse<java.lang.Number> createOrUpdateConfig(OpenApiBankCreateOrUpdateConfigDto body) {
            return httpClient.request("POST", "/v1/merchant/create-or-update-config", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<java.lang.Number>>() {});
        }

    /**
         * MerchantController_deleteConfig
         */
        public TingeeApiResponse<java.lang.Number> deleteConfig(OpenApiDeleteConfigDto body) {
            return httpClient.request("POST", "/v1/merchant/delete-config", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<java.lang.Number>>() {});
        }

    /**
         * MerchantController_configAccountBusinessForACB
         */
        public TingeeApiResponse<OpenApiCreateBankVAOutputDto> configAccountBusiness(OpenApiConfigAccountBusinessDto body) {
            return httpClient.request("POST", "/v1/merchant/config-account-business", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiCreateBankVAOutputDto>>() {});
        }

    /**
         * MerchantController_deleteConfigAccountBusiness
         */
        public TingeeApiResponse<Object> deleteConfigAccountBusiness(OpenApiDeleteConfigBusinessDto body) {
            return httpClient.request("POST", "/v1/merchant/delete-config-account-business", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<Object>>() {});
        }

    /**
         * MerchantController_createMerchant
         */
        public TingeeApiResponse<java.lang.Number> create(OpenApiCreateMerchantDto body) {
            return httpClient.request("POST", "/v1/merchant/create", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<java.lang.Number>>() {});
        }

    /**
         * MerchantController_getPagingMerchants
         */
        public TingeeApiResponse<PagedResultDto<MerchantDto>> getPaging(OpenApiGetPagingMerchantsDto body) {
            return httpClient.request("POST", "/v1/merchant/get-paging", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<MerchantDto>>>() {});
        }

    /**
         * MerchantController_delete
         */
        public TingeeApiResponse<EmptyDto> delete(Double merchantId) {
            Map<String, String> queryParams = new HashMap<>();
            queryParams.put("merchantId", String.valueOf(merchantId));
            return httpClient.request("DELETE", "/v1/merchant/delete", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<EmptyDto>>() {});
        }
    }

    public final DirectDebitGroup directDebit;

    public class DirectDebitGroup {
        private final vn.tingee.sdk.client.TingeeHttpClient httpClient;
        public DirectDebitGroup(vn.tingee.sdk.client.TingeeHttpClient httpClient) { this.httpClient = httpClient; }

    /**
         * DirectDebitController_getRegisterUrl
         */
        public TingeeApiResponse<String> register(OpenApiRegisterDto body) {
            return httpClient.request("POST", "/v1/direct-debit/register", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<String>>() {});
        }

    /**
         * DirectDebitController_paymentBill
         */
        public TingeeApiResponse<PaymentBillResponseDto> paymentBill(OpenApiPaymentBillDto body) {
            return httpClient.request("POST", "/v1/direct-debit/payment-bill", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PaymentBillResponseDto>>() {});
        }

    /**
         * DirectDebitController_deleteToken
         */
        public TingeeApiResponse<DeleteSubscriptionOutputDto> deleteSubscription(OpenApiDeleteSubscriptionDto body) {
            return httpClient.request("DELETE", "/v1/direct-debit/delete-subscription", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<DeleteSubscriptionOutputDto>>() {});
        }

    /**
         * DirectDebitController_refund
         */
        public TingeeApiResponse<RefundOutputDto> refund(OpenApiRefundInputDto body) {
            return httpClient.request("POST", "/v1/direct-debit/refund", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<RefundOutputDto>>() {});
        }

    /**
         * DirectDebitController_getEditConfirmPaymentMethodUrl
         */
        public TingeeApiResponse<String> editConfirmPaymentMethod(OpenApiEditConfirmBeforePaymentMethodDto body) {
            return httpClient.request("PUT", "/v1/direct-debit/edit-confirm-payment-method", body, null, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<String>>() {});
        }

    /**
         * DirectDebitController_getPaymentSubscriptionStatus
         */
        public TingeeApiResponse<OpenApiSubscriptionStatusResponseDto> getSubscriptionStatus(String requestId, String subscriptionId, String tokenRef) {
            Map<String, String> queryParams = new HashMap<>();
            queryParams.put("requestId", String.valueOf(requestId));
            queryParams.put("subscriptionId", String.valueOf(subscriptionId));
            queryParams.put("tokenRef", String.valueOf(tokenRef));
            return httpClient.request("GET", "/v1/direct-debit/get-subscription-status", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiSubscriptionStatusResponseDto>>() {});
        }

    /**
         * DirectDebitController_getPaymentTransactionStatus
         */
        public TingeeApiResponse<OpenApiPaymentTransactionStatusResponseDto> getTransactionStatus(String transactionId, String tokenRef, String subscriptionId) {
            Map<String, String> queryParams = new HashMap<>();
            queryParams.put("transactionId", String.valueOf(transactionId));
            queryParams.put("tokenRef", String.valueOf(tokenRef));
            queryParams.put("subscriptionId", String.valueOf(subscriptionId));
            return httpClient.request("GET", "/v1/direct-debit/get-transaction-status", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<OpenApiPaymentTransactionStatusResponseDto>>() {});
        }

    /**
         * DirectDebitController_getPagingTransactions
         */
        public TingeeApiResponse<PagedResultDto<OpenApiPaymentTransactionsPagedOutputDto>> getPagingTransactions(String subscriptionId, String tokenRef, LocalDateTime startTime, LocalDateTime endTime, Integer skipCount, Integer maxResultCount) {
            Map<String, String> queryParams = new HashMap<>();
            queryParams.put("subscriptionId", String.valueOf(subscriptionId));
            queryParams.put("tokenRef", String.valueOf(tokenRef));
            queryParams.put("startTime", String.valueOf(startTime));
            queryParams.put("endTime", String.valueOf(endTime));
            queryParams.put("skipCount", String.valueOf(skipCount));
            queryParams.put("maxResultCount", String.valueOf(maxResultCount));
            return httpClient.request("GET", "/v1/direct-debit/get-paging-transactions", null, queryParams, new com.fasterxml.jackson.core.type.TypeReference<TingeeApiResponse<PagedResultDto<OpenApiPaymentTransactionsPagedOutputDto>>>() {});
        }
    }

    // <generated-methods-end>

    public static class TingeeClientBuilder {
        private final String secretKey;
        private final String clientId;
        private TingeeEnvironment environment;
        private Integer timeout;
        private String baseUrl;

        private TingeeClientBuilder(String secretKey, String clientId) {
            if (secretKey == null || secretKey.isEmpty()) {
                throw new IllegalArgumentException("secretKey is required");
            }
            if (clientId == null || clientId.isEmpty()) {
                throw new IllegalArgumentException("clientId is required");
            }
            this.secretKey = secretKey;
            this.clientId = clientId;
        }

        public TingeeClientBuilder environment(vn.tingee.sdk.client.TingeeEnvironment environment) {
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
            vn.tingee.sdk.client.TingeeClientOptions.Builder optionsBuilder = 
                vn.tingee.sdk.client.TingeeClientOptions.builder(secretKey, clientId);
            
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

