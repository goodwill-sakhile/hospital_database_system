package com.hms.discharge;

public class Referral {
    private String referralId;
    private String patientId;
    private String referredTo;
    private ReferralType type;
    private String notes;

    public Referral(String referralId, String patientId, String referredTo, ReferralType type, String notes) {
        this.referralId = referralId;
        this.patientId = patientId;
        this.referredTo = referredTo;
        this.type = type;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Referral #" + referralId + ": " + patientId + " => " + referredTo + " (" + type + ")";
    }
}
