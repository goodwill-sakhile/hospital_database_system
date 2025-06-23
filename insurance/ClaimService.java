package com.hms.insurance;

public class ClaimService {
    private final InsuranceRepository repo;

    public ClaimService(InsuranceRepository repo) {
        this.repo = repo;
    }

    public void submitClaim(String claimId, String patientId, String policyId, double amount) {
        InsuranceClaim claim = new InsuranceClaim(claimId, patientId, policyId, amount);
        repo.saveClaim(claim);
        System.out.println("Claim submitted: " + claimId);
    }

    public void approveClaim(String claimId) {
        InsuranceClaim claim = repo.getAllClaims().stream()
            .filter(c -> c.getClaimId().equals(claimId))
            .findFirst()
            .orElse(null);
        if (claim != null) {
            claim.approve();
            System.out.println("Claim approved: " + claimId);
        }
    }

    public void rejectClaim(String claimId) {
        InsuranceClaim claim = repo.getAllClaims().stream()
            .filter(c -> c.getClaimId().equals(claimId))
            .findFirst()
            .orElse(null);
        if (claim != null) {
            claim.reject();
            System.out.println("Claim rejected: " + claimId);
        }
    }
}
