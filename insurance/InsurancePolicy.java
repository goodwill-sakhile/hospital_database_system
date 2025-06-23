package com.hms.insurance;

public class InsurancePolicy {
    private String policyId;
    private String patientId;
    private String provider;
    private double coverageAmount;

    public InsurancePolicy(String policyId, String patientId, String provider, double coverageAmount) {
        this.policyId = policyId;
        this.patientId = patientId;
        this.provider = provider;
        this.coverageAmount = coverageAmount;
    }

    public String getPolicyId() { return policyId; }
    public String getPatientId() { return patientId; }
    public String getProvider() { return provider; }
    public double getCoverageAmount() { return coverageAmount; }
}
