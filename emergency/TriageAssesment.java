package com.hms.emergency;

public class TriageAssessment {

    public static TriageLevel assessSeverity(String symptoms) {
        if (symptoms.toLowerCase().contains("unconscious")) return TriageLevel.RED;
        if (symptoms.toLowerCase().contains("chest pain")) return TriageLevel.ORANGE;
        if (symptoms.toLowerCase().contains("bleeding")) return TriageLevel.YELLOW;
        return TriageLevel.GREEN;
    }
}
