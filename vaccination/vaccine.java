package com.hms.vaccination;

public class Vaccine {
    private String vaccineId;
    private VaccineType type;
    private int requiredDoses;

    public Vaccine(String vaccineId, VaccineType type, int requiredDoses) {
        this.vaccineId = vaccineId;
        this.type = type;
        this.requiredDoses = requiredDoses;
    }

    public String getVaccineId() { return vaccineId; }
    public VaccineType getType() { return type; }
    public int getRequiredDoses() { return requiredDoses; }
}
