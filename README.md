# Tingee SDK for Java

> SDK chính thức tích hợp **Tingee Open API** cho Java 17+

[![Maven Central](https://img.shields.io/maven-central/v/com.tingee/sdk-java)](https://central.sonatype.com/artifact/com.tingee/sdk-java)
[![Java](https://img.shields.io/badge/Java-17%2B-orange)](https://openjdk.org)
[![License: ISC](https://img.shields.io/badge/License-ISC-yellow)](LICENSE)

---

## Cài đặt

### Maven

```xml
<dependency>
  <groupId>com.tingee</groupId>
  <artifactId>sdk-java</artifactId>
  <version>0.1.0</version>
</dependency>
```

### Gradle

```groovy
implementation 'com.tingee:sdk-java:0.1.0'
```

---

## Bắt đầu nhanh

```java
import com.tingee.sdk.TingeeClient;
import com.tingee.sdk.client.TingeeEnvironment;

TingeeClient client = TingeeClient.builder()
    .secretKey(System.getenv("TINGEE_SECRET_KEY"))
    .clientId(System.getenv("TINGEE_CLIENT_ID"))
    .environment(TingeeEnvironment.UAT)  // UAT | PRODUCTION, default UAT
    .timeout(90000)                      // ms, default 90000
    .baseUrl("https://uat-open-api.tingee.vn") // tùy chọn, ghi đè environment
    .build();

var req = new OpenApiGetMerchantPagedInputDto();
req.setMaxResultCount(10); req.setSkipCount(0);
var result = client.v1.merchantGetPaging(req);

if ("00".equals(result.getCode())) {
    System.out.println(result.getData());
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
    return TingeeClient.builder()
        .secretKey(secretKey)
        .clientId(clientId)
        .environment(TingeeEnvironment.UAT)
        .build();
}
```

---

## Gọi API

Tất cả phương thức nằm trong `client.v1.*`:

```java
// Lấy danh sách shop (có phân trang)
var pageReq = new OpenApiGetShopPagedInputDto();
pageReq.setMaxResultCount(10); pageReq.setSkipCount(0);
var result = client.v1.shopGetPaging(pageReq);
if (result.isSuccess()) {
    result.getData().getItems().forEach(s -> System.out.println(s.getName()));
}

// Direct Debit
var subReq = new DirectDebitGetSubscriptionStatusInputDto();
subReq.setRequestId("uuid-here");
subReq.setSubscriptionId("uuid-here");
subReq.setTokenRef("token-ref");
var sub = client.v1.directDebitGetSubscriptionStatus(subReq);
```

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
