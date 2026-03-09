# Tingee SDK for Java

> SDK chính thức tích hợp **Tingee Open API** cho Java 17+

[![Maven Central](https://img.shields.io/maven-central/v/vn.tingee/sdk-java)](https://central.sonatype.com/artifact/vn.tingee/sdk-java)
[![Java](https://img.shields.io/badge/Java-17%2B-orange)](https://openjdk.org)
[![License: ISC](https://img.shields.io/badge/License-ISC-yellow)](LICENSE)

---

## Cài đặt

### Maven

```xml
<dependency>
  <groupId>vn.tingee</groupId>
  <artifactId>sdk-java</artifactId>
  <version>0.1.0</version>
</dependency>
```

### Gradle

```groovy
implementation 'vn.tingee:sdk-java:0.1.0'
```

---

## Bắt đầu nhanh

```java
import vn.tingee.sdk.TingeeClient;
import vn.tingee.sdk.client.TingeeEnvironment;

TingeeClient client = TingeeClient.builder(
        System.getenv("TINGEE_SECRET_KEY"),
        System.getenv("TINGEE_CLIENT_ID"))
    .environment(TingeeEnvironment.UAT)  // UAT | PRODUCTION, mặc định PRODUCTION
    .timeout(90000)                      // ms, mặc định 90000
    .baseUrl("https://uat-open-api.tingee.vn") // tùy chọn, ghi đè environment
    .build();

var req = new OpenApiGetPagingMerchantsDto(0, 10); // required fields qua constructor
var result = client.merchant.getPaging(req);

if (result.isSuccess()) {
    result.getData().getItems().forEach(m -> System.out.println(m));
} else {
    System.err.println("Lỗi " + result.getCode() + ": " + result.getMessage());
}
```

---

## Cấu hình

| Tham số | Kiểu | Mặc định | Mô tả |
|---|---|---|---|
| `secretKey` | `String` | — | **Bắt buộc.** Secret key từ Tingee Dashboard |
| `clientId` | `String` | — | **Bắt buộc.** Client ID từ Tingee Dashboard |
| `environment` | `TingeeEnvironment` | `UAT` | `UAT` \| `PRODUCTION` |
| `baseUrl` | `String` | — | Ghi đè URL (bỏ qua `environment`) |
| `timeout` | `int` | `90000` | Timeout (ms) |

### Spring Boot

```java
@Bean
public TingeeClient tingeeClient(
        @Value("${tingee.secret-key}") String secretKey,
        @Value("${tingee.client-id}")  String clientId) {
    return TingeeClient.builder(secretKey, clientId)
        .environment(TingeeEnvironment.UAT)
        .build();
}
```

---

## Gọi API

Các phương thức được nhóm theo tính năng (`client.<group>.<method>()`):

```java
// Merchant — lấy danh sách (required fields qua constructor)
var req = new OpenApiGetPagingMerchantsDto(0, 10);
var result = client.merchant.getPaging(req);
if (result.isSuccess()) {
    result.getData().getItems().forEach(m -> System.out.println(m));
}

// Shop — lấy danh sách
var shopReq = new OpenApiGetShopPagedInputDto(0, 10);
var shopResult = client.shop.getPaging(shopReq);

// Direct Debit
var sub = client.directDebit.getSubscriptionStatus(
    "request-id", "subscription-id", "token-ref");
```

> **Input DTO:** Required fields được bắt buộc qua constructor. Optional fields set thêm qua setter.
>
> **Output DTO:** Tự động deserialize từ JSON response.
>
> **`toString()`:** Tất cả DTO đều implement `toString()` — in trực tiếp để debug.
>
> **Lưu ý:** SDK trả về `TingeeApiResponse<T>` với `code` và `message`. Kiểm tra `result.isSuccess()` để xác định thành công — SDK **không tự throw** khi `code != "00"`.

---

## Xác thực Webhook

```java
// Spring Controller
@PostMapping("/webhook/tingee")
public ResponseEntity<?> handleWebhook(
        HttpServletRequest req,
        @RequestBody Map<String, Object> body) {

    var result = client.verifyWebhookSignature(
        req.getHeader("x-signature"),
        req.getHeader("x-request-timestamp"),
        body
    );

    if (result.isError()) {
        return ResponseEntity.status(401).body(Map.of("error", result.getMessage()));
    }

    // Xử lý giao dịch...
    return ResponseEntity.ok(Map.of("received", true));
}
```

---

## Bank Constants

```java
import com.tingee.sdk.constants.BankConstants;
import com.tingee.sdk.constants.BankConstants.BankNameEnum;

BankConstants.getBin(BankNameEnum.VIETCOMBANK)       // "970436"
BankConstants.getShortName(BankNameEnum.VIETCOMBANK) // "Vietcombank"
BankConstants.getFullName(BankNameEnum.VIETCOMBANK)  // "Ngân hàng TMCP Ngoại Thương Việt Nam"
```

---

## Xem thêm

- [CHANGELOG](./CHANGELOG.md)
- [Tài liệu Tingee Open API](https://open-api.tingee.vn)
- [Tài liệu Tingee Developer](https://developers.tingee.vn)
- [Trang chủ Tingee](https://tingee.vn)
