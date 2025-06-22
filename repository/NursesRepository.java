package com.hms.repository;

import com.hms.model.Nurse;
import java.util.ArrayList;
import java.util.List;

/**
 * Repository for nurses.
 */
public class NurseRepository {
    private final List<Nurse> nurses = new ArrayList<>();

    public void save(Nurse nurse) {
        nurses.add(nurse);
    }

    public Nurse findById(String id) {
        for (Nurse n : nurses) {
            if (n.getId().equals(id)) {
                return n;
            }
        }
        return null;
    }

    public void delete(String id) {
        nurses.removeIf(n -> n.getId().equals(id));
    }

    public List<Nurse> findAll() {
        return new ArrayList<>(nurses);
    }
}
