package com.tingee.sdk.constants;

import java.util.*;

/**
 * Hand-crafted bank constants for the Tingee SDK.
 * Do NOT auto-generate this file.
 */
public final class BankConstants {

    private BankConstants() {}

    // ── Enums ──────────────────────────────────────────────────────────────

    public enum BankName {
        OCB, BIDV, MBB, ACB, VPB, PGB, VIB, STB, CTG, VCB, AGRIBANK, SHINHAN, COB, MSB
    }

    public enum BankAccountType {
        PERSONAL_ACCOUNT("personal-account"),
        BUSINESS_ACCOUNT("business-account"),
        BUSINESS_HOUSEHOLD_ACCOUNT("business-household-account");

        private final String value;

        BankAccountType(String value) { this.value = value; }

        public String getValue() { return value; }

        @Override
        public String toString() { return value; }
    }

    // ── BankInfo ───────────────────────────────────────────────────────────

    public static final class BankInfo {
        private final BankName code;
        private final String name;
        private final String shortName;
        private final String bin;

        public BankInfo(BankName code, String name, String shortName, String bin) {
            this.code      = code;
            this.name      = name;
            this.shortName = shortName;
            this.bin       = bin;
        }

        public BankName getCode()      { return code; }
        public String   getName()      { return name; }
        public String   getShortName() { return shortName; }
        public String   getBin()       { return bin; }
    }

    // ── Bank list ──────────────────────────────────────────────────────────

    private static final List<BankInfo> BANKS;

    static {
        List<BankInfo> list = new ArrayList<>();
        list.add(new BankInfo(BankName.VCB,      "Ngân hàng TMCP Ngoại Thương Việt Nam",                   "Vietcombank",  "970436"));
        list.add(new BankInfo(BankName.CTG,      "Ngân hàng TMCP Công thương Việt Nam",                     "VietinBank",   "970415"));
        list.add(new BankInfo(BankName.BIDV,     "Ngân hàng TMCP Đầu tư và Phát triển Việt Nam",            "BIDV",         "970418"));
        list.add(new BankInfo(BankName.AGRIBANK, "Ngân hàng Nông nghiệp và Phát triển Nông thôn Việt Nam",  "Agribank",     "970405"));
        list.add(new BankInfo(BankName.MBB,      "Ngân hàng TMCP Quân đội",                                 "MB Bank",      "970422"));
        list.add(new BankInfo(BankName.ACB,      "Ngân hàng TMCP Á Châu",                                   "ACB",          "970416"));
        list.add(new BankInfo(BankName.OCB,      "Ngân hàng TMCP Phương Đông",                              "OCB Bank",     "970448"));
        list.add(new BankInfo(BankName.VPB,      "Ngân hàng TMCP Việt Nam Thịnh Vượng",                    "VPBank",       "970432"));
        list.add(new BankInfo(BankName.STB,      "Ngân hàng TMCP Sài Gòn Thương Tín",                      "Sacombank",    "970403"));
        list.add(new BankInfo(BankName.VIB,      "Ngân hàng TMCP Quốc tế Việt Nam",                        "VIB",          "970441"));
        list.add(new BankInfo(BankName.PGB,      "Ngân Hàng TMCP Thịnh vượng và Phát triển",               "PGBank",       "970430"));
        list.add(new BankInfo(BankName.SHINHAN,  "Ngân hàng TNHH MTV Shinhan Việt Nam",                     "Shinhan Bank", "970424"));
        list.add(new BankInfo(BankName.COB,      "Ngân hàng Hợp tác Xã Việt Nam",                          "Co-opBank",    "970446"));
        BANKS = Collections.unmodifiableList(list);
    }

    // ── Accessors ──────────────────────────────────────────────────────────

    public static List<BankInfo> getBanks() {
        return BANKS;
    }

    /** Find bank code (BankName enum) by BIN */
    public static Optional<BankName> getBankCode(String bankBin) {
        return BANKS.stream()
                .filter(b -> bankBin.equals(b.getBin()))
                .map(BankInfo::getCode)
                .findFirst();
    }

    /** Find short name by BIN */
    public static Optional<String> getBankShortName(String bankBin) {
        return BANKS.stream()
                .filter(b -> bankBin.equals(b.getBin()))
                .map(BankInfo::getShortName)
                .findFirst();
    }

    /** Find BIN by bank name enum */
    public static Optional<String> getBankBin(BankName bankName) {
        return BANKS.stream()
                .filter(b -> bankName == b.getCode())
                .map(BankInfo::getBin)
                .findFirst();
    }
}
