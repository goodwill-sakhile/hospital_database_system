package com.hms.emergency;

public class EmergencyPatient {
    private String patientId;
    private String name;
    private TriageLevel level;
    private String symptoms;

    public EmergencyPatient(String patientId, String name, TriageLevel level, String symptoms) {
        this.patientId = patientId;
        this.name = name;
        this.level = level;
        this.symptoms = symptoms;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public TriageLevel getLevel() { return level; }
    public String getSymptoms() { return symptoms; }

    @Override
    public String toString() {
        return level + " - " + name + " (" + patientId + "): " + symptoms;
    }
}
