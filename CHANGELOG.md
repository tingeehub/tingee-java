# Changelog — Tingee SDK for Java

All notable changes to this package will be documented in this file.
Format: [Keep a Changelog](https://keepachangelog.com/en/1.0.0/)

---

## [0.1.0] — 2026-03-04

### Initial release

#### Added
- `TingeeClient` — main client with builder pattern:
  ```java
  TingeeClient client = TingeeClient.builder()
      .secretKey("...").clientId("...").environment(TingeeEnvironment.UAT).build();
  ```
- `client.v1.*` — **49 auto-generated V1 API methods** from OpenAPI spec
  - VietQR, Dynamic QR generation
  - Merchant, Shop, Device management
  - Direct Debit / Subscription APIs
  - Bank / VA (Virtual Account) APIs
  - Account info, Notification, Config endpoints
- `TingeeClientCustomV1` — hand-written method extension class (never overwritten by generator), accessible via `client.v1Custom.*`
- `client.verifyWebhookSignature(signature, timestamp, body)` — verify incoming Tingee webhooks using secretKey already set on the client
- `TingeeSigner.verifyWebhookSignature(secretKey, signature, timestamp, body)` — standalone static webhook verifier
- `TingeeHttpClient` — OkHttp-based HTTP client with:
  - Automatic HMAC-SHA512 signature on every request
  - Timestamp forced to **Asia/Ho_Chi_Minh (UTC+7)** to prevent "Request expired" errors
  - Query parameter support for GET endpoints
  - Configurable connect/read/write timeout
- `BankConstants` — Vietnamese bank name enum, BIN codes, display names
- Full model classes for all 138 DTO types (`com.tingee.sdk.model.*`)
- Environment: `TingeeEnvironment.UAT` | `TingeeEnvironment.PRODUCTION`

#### Design decisions
- HTTP client returns raw `TingeeApiResponse<T>` — callers check `response.getCode().equals("00")` themselves; no auto-throw on business errors
- Network/HTTP errors throw `TingeeHttpError`

#### Dependencies
- OkHttp 4.12.0, Jackson 2.16.1 (databind + jsr310)
- Java 17+, Maven
