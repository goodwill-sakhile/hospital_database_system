package com.hms.insurance;

public class PolicyService {
    private final InsuranceRepository repo;

    public PolicyService(InsuranceRepository repo) {
        this.repo = repo;
    }

    public void registerPolicy(String policyId, String patientId, String provider, double coverage) {
        InsurancePolicy policy = new InsurancePolicy(policyId, patientId, provider, coverage);
        repo.savePolicy(policy);
        System.out.println("Policy registered: " + policyId);
    }

    public InsurancePolicy getPolicy(String id) {
        return repo.findPolicy(id);
    }
}
