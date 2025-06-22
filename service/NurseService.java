package com.hms.service;

import com.hms.model.Nurse;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages nurse-related operations.
 */
public class NurseService {
    private List<Nurse> nurses = new ArrayList<>();

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
        System.out.println("Nurse added: " + nurse.getName());
    }

    public Nurse findNurseById(String id) {
        for (Nurse n : nurses) {
            if (n.getId().equals(id)) {
                return n;
            }
        }
        return null;
    }

    public void removeNurse(String id) {
        nurses.removeIf(n -> n.getId().equals(id));
        System.out.println("Nurse removed.");
    }

    public List<Nurse> getAllNurses() {
        return nurses;
    }
}
