package com.hms.repository;

import com.hms.model.Visit;
import java.util.ArrayList;
import java.util.List;

/**
 * Repository for visit logs.
 */
public class VisitRepository {
    private final List<Visit> visits = new ArrayList<>();

    public void save(Visit visit) {
        visits.add(visit);
    }

    public List<Visit> findByPatientId(String patientId) {
        List<Visit> result = new ArrayList<>();
        for (Visit v : visits) {
            if (v.getPatientId().equals(patientId)) {
                result.add(v);
            }
        }
        return result;
    }

    public List<Visit> findAll() {
        return new ArrayList<>(visits);
    }
}
