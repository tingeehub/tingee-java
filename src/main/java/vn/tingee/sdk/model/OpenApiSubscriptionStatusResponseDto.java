package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Auto-generated from OpenAPI spec
 * DO NOT EDIT MANUALLY
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class OpenApiSubscriptionStatusResponseDto {
    @lombok.NonNull
    @JsonProperty("lastModificationTime")
    private LocalDateTime lastModificationTime;
    @JsonProperty("lastModifierUserId")
    private Double lastModifierUserId;
    @JsonProperty("email")
    private String email;
    @lombok.NonNull
    @JsonProperty("bankName")
    private BankNameEnum bankName;
    @JsonProperty("accountName")
    private String accountName;
    @lombok.NonNull
    @JsonProperty("accountNumber")
    private String accountNumber;
    @lombok.NonNull
    @JsonProperty("phone")
    private String phone;
    @lombok.NonNull
    @JsonProperty("confirmPaymentByEmail")
    private Boolean confirmPaymentByEmail;
    @JsonProperty("confirmEmail")
    private String confirmEmail;
    @lombok.NonNull
    @JsonProperty("confirmPaymentByZalo")
    private Boolean confirmPaymentByZalo;
    @lombok.NonNull
    @JsonProperty("confirmPhoneNumber")
    private String confirmPhoneNumber;
    @lombok.NonNull
    @JsonProperty("tokenRef")
    private String tokenRef;
    @lombok.NonNull
    @JsonProperty("status")
    private DirectDebitStatusEnum status;
    @lombok.NonNull
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    @lombok.NonNull
    @JsonProperty("bankBin")
    private String bankBin;

    /** Use this constructor to set all required fields. */
    public OpenApiSubscriptionStatusResponseDto(LocalDateTime lastModificationTime, BankNameEnum bankName, String accountNumber, String phone, Boolean confirmPaymentByEmail, Boolean confirmPaymentByZalo, String confirmPhoneNumber, String tokenRef, DirectDebitStatusEnum status, String subscriptionId, String bankBin) {
        this.lastModificationTime = lastModificationTime;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.phone = phone;
        this.confirmPaymentByEmail = confirmPaymentByEmail;
        this.confirmPaymentByZalo = confirmPaymentByZalo;
        this.confirmPhoneNumber = confirmPhoneNumber;
        this.tokenRef = tokenRef;
        this.status = status;
        this.subscriptionId = subscriptionId;
        this.bankBin = bankBin;
    }
}
