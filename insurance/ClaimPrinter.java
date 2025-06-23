package com.hms.insurance;

import java.util.List;

public class ClaimPrinter {
    public static void printClaims(List<InsuranceClaim> claims) {
        System.out.println("=== Insurance Claims ===");
        for (InsuranceClaim c : claims) {
            System.out.println("Claim #" + c.getClaimId() + " | Policy: " + c.getPolicyId() +
                               " | Amount: R" + c.getAmount() + " | Status: " + c.getStatus());
        }
    }
}
