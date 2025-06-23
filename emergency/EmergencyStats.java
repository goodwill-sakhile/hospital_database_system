package com.hms.emergency;

import java.util.HashMap;
import java.util.Map;

public class EmergencyStats {

    public static void printSeverityStats(List<EmergencyPatient> patients) {
        Map<TriageLevel, Integer> stats = new HashMap<>();
        for (EmergencyPatient p : patients) {
            stats.put(p.getLevel(), stats.getOrDefault(p.getLevel(), 0) + 1);
        }

        System.out.println("=== Emergency Triage Stats ===");
        for (TriageLevel level : TriageLevel.values()) {
            System.out.println(level + ": " + stats.getOrDefault(level, 0));
        }
    }
}
