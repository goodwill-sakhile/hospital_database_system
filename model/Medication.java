package com.hms.model;

/**
 * Represents a prescribed medication.
 */
public class Medication {
    private String id;
    private String name;
    private String dosage;
    private String frequency;

    public Medication(String id, String name, String dosage, String frequency) {
        this.id = id;
        this.name = name;
        this.dosage = dosage;
        this.frequency = frequency;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public String getDosage() { return dosage; }

    public String getFrequency() { return frequency; }

    @Override
    public String toString() {
        return "Medication{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dosage='" + dosage + '\'' +
                ", frequency='" + frequency + '\'' +
                '}';
    }
}
