package com.hms.emergency;

import java.util.ArrayList;
import java.util.List;

public class EmergencyRepository {
    private final List<EmergencyPatient> treated = new ArrayList<>();

    public void add(EmergencyPatient p) {
        treated.add(p);
    }

    public List<EmergencyPatient> getAllTreated() {
        return treated;
    }
}
