package com.hms.discharge;

import java.util.List;

public class DischargePrinter {
    public static void printRecords(List<DischargeRecord> list) {
        System.out.println("=== Discharge Records ===");
        for (DischargeRecord r : list) {
            System.out.println(r);
        }
    }

    public static void printReferrals(List<Referral> list) {
        System.out.println("=== Referrals ===");
        for (Referral r : list) {
            System.out.println(r);
        }
    }
}
