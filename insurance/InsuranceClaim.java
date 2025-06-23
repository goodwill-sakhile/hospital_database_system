package com.hms.insurance;

public class InsuranceClaim {
    private String claimId;
    private String patientId;
    private String policyId;
    private double amount;
    private ClaimStatus status;

    public InsuranceClaim(String claimId, String patientId, String policyId, double amount) {
        this.claimId = claimId;
        this.patientId = patientId;
        this.policyId = policyId;
        this.amount = amount;
        this.status = ClaimStatus.PENDING;
    }

    public String getClaimId() { return claimId; }
    public String getPatientId() { return patientId; }
    public String getPolicyId() { return policyId; }
    public double getAmount() { return amount; }
    public ClaimStatus getStatus() { return status; }

    public void approve() { this.status = ClaimStatus.APPROVED; }
    public void reject() { this.status = ClaimStatus.REJECTED; }
}
