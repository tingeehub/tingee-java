package vn.tingee.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenApiSubscriptionStatusResponseDto {
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
    @JsonProperty("tokenRef")
    private String tokenRef;
    @lombok.NonNull
    @JsonProperty("status")
    private DirectDebitStatusEnum status;
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    /** Bank BIN. Use {@link BankBinEnum} constants. */
    @JsonProperty("bankBin")
    private String bankBin;

    /** Use this constructor to set all required fields. */
    public OpenApiSubscriptionStatusResponseDto(BankNameEnum bankName, String accountNumber, String phone, Boolean confirmPaymentByEmail, Boolean confirmPaymentByZalo, String confirmPhoneNumber, DirectDebitStatusEnum status) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.phone = phone;
        this.confirmPaymentByEmail = confirmPaymentByEmail;
        this.confirmPaymentByZalo = confirmPaymentByZalo;
        this.confirmPhoneNumber = confirmPhoneNumber;
        this.status = status;
    }
}
