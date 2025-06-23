package com.hms.insurance;

public class ClaimValidator {

    public static boolean isValid(InsuranceClaim claim, InsurancePolicy policy) {
        if (claim.getAmount() <= 0 || claim.getAmount() > policy.getCoverageAmount()) {
            System.out.println("Invalid claim: exceeds coverage.");
            return false;
        }
        return true;
    }
}
