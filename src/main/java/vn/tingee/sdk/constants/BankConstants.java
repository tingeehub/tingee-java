package vn.tingee.sdk.constants;

import java.util.*;

/**
 * Hand-crafted bank constants for the Tingee SDK.
 * Do NOT auto-generate this file.
 */
public final class BankConstants {

    private BankConstants() {}

    // â”€â”€ Enums â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€

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

    // â”€â”€ BankInfo â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€

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

    // â”€â”€ Bank list â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€

    private static final List<BankInfo> BANKS;

    static {
        List<BankInfo> list = new ArrayList<>();
        list.add(new BankInfo(BankName.VCB,      "NgÃ¢n hÃ ng TMCP Ngoáº¡i ThÆ°Æ¡ng Viá»‡t Nam",                   "Vietcombank",  "970436"));
        list.add(new BankInfo(BankName.CTG,      "NgÃ¢n hÃ ng TMCP CÃ´ng thÆ°Æ¡ng Viá»‡t Nam",                     "VietinBank",   "970415"));
        list.add(new BankInfo(BankName.BIDV,     "NgÃ¢n hÃ ng TMCP Äáº§u tÆ° vÃ  PhÃ¡t triá»ƒn Viá»‡t Nam",            "BIDV",         "970418"));
        list.add(new BankInfo(BankName.AGRIBANK, "NgÃ¢n hÃ ng NÃ´ng nghiá»‡p vÃ  PhÃ¡t triá»ƒn NÃ´ng thÃ´n Viá»‡t Nam",  "Agribank",     "970405"));
        list.add(new BankInfo(BankName.MBB,      "NgÃ¢n hÃ ng TMCP QuÃ¢n Ä‘á»™i",                                 "MB Bank",      "970422"));
        list.add(new BankInfo(BankName.ACB,      "NgÃ¢n hÃ ng TMCP Ã ChÃ¢u",                                   "ACB",          "970416"));
        list.add(new BankInfo(BankName.OCB,      "NgÃ¢n hÃ ng TMCP PhÆ°Æ¡ng ÄÃ´ng",                              "OCB Bank",     "970448"));
        list.add(new BankInfo(BankName.VPB,      "NgÃ¢n hÃ ng TMCP Viá»‡t Nam Thá»‹nh VÆ°á»£ng",                    "VPBank",       "970432"));
        list.add(new BankInfo(BankName.STB,      "NgÃ¢n hÃ ng TMCP SÃ i GÃ²n ThÆ°Æ¡ng TÃ­n",                      "Sacombank",    "970403"));
        list.add(new BankInfo(BankName.VIB,      "NgÃ¢n hÃ ng TMCP Quá»‘c táº¿ Viá»‡t Nam",                        "VIB",          "970441"));
        list.add(new BankInfo(BankName.PGB,      "NgÃ¢n HÃ ng TMCP Thá»‹nh vÆ°á»£ng vÃ  PhÃ¡t triá»ƒn",               "PGBank",       "970430"));
        list.add(new BankInfo(BankName.SHINHAN,  "NgÃ¢n hÃ ng TNHH MTV Shinhan Viá»‡t Nam",                     "Shinhan Bank", "970424"));
        list.add(new BankInfo(BankName.COB,      "NgÃ¢n hÃ ng Há»£p tÃ¡c XÃ£ Viá»‡t Nam",                          "Co-opBank",    "970446"));
        BANKS = Collections.unmodifiableList(list);
    }

    // â”€â”€ Accessors â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€

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

