package com.hms.discharge;

public class ReferralManager {
    private final ReferralRepository repo;

    public ReferralManager(ReferralRepository repo) {
        this.repo = repo;
    }

    public void refer(String patientId, String to, ReferralType type, String notes) {
        String id = "R" + System.currentTimeMillis();
        Referral r = new Referral(id, patientId, to, type, notes);
        repo.add(r);
        System.out.println("Referral created: " + id);
    }
}
