package com.hms.insurance;

import java.util.*;

public class InsuranceRepository {
    private final Map<String, InsurancePolicy> policies = new HashMap<>();
    private final Map<String, InsuranceClaim> claims = new HashMap<>();

    public void savePolicy(InsurancePolicy policy) {
        policies.put(policy.getPolicyId(), policy);
    }

    public void saveClaim(InsuranceClaim claim) {
        claims.put(claim.getClaimId(), claim);
    }

    public InsurancePolicy findPolicy(String id) {
        return policies.get(id);
    }

    public List<InsuranceClaim> getClaimsForPatient(String patientId) {
        List<InsuranceClaim> list = new ArrayList<>();
        for (InsuranceClaim c : claims.values()) {
            if (c.getPatientId().equals(patientId)) {
                list.add(c);
            }
        }
        return list;
    }

    public List<InsuranceClaim> getAllClaims() {
        return new ArrayList<>(claims.values());
    }
}
