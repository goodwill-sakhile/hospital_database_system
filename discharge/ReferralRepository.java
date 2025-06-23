package com.hms.discharge;

import java.util.ArrayList;
import java.util.List;

public class ReferralRepository {
    private final List<Referral> referrals = new ArrayList<>();

    public void add(Referral r) {
        referrals.add(r);
    }

    public List<Referral> getAll() {
        return referrals;
    }
}
