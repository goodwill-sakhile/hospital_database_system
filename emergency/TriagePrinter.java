package com.hms.emergency;

import java.util.List;

public class TriagePrinter {
    public static void printTreated(List<EmergencyPatient> patients) {
        System.out.println("=== Treated Emergency Patients ===");
        for (EmergencyPatient p : patients) {
            System.out.println(p);
        }
    }
}
