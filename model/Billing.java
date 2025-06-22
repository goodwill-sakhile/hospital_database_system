package com.hms.model;

/**
 * Represents a billing record for a patient.
 */
public class Billing {
    private String id;
    private String patientId;
    private double amount;
    private String date;
    private boolean paid;

    public Billing(String id, String patientId, double amount, String date, boolean paid) {
        this.id = id;
        this.patientId = patientId;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
    }

    public String getId() { return id; }

    public String getPatientId() { return patientId; }

    public double getAmount() { return amount; }

    public String getDate() { return date; }

    public boolean isPaid() { return paid; }

    public void setPaid(boolean paid) { this.paid = paid; }

    @Override
    public String toString() {
        return "Billing{" +
                "id='" + id + '\'' +
                ", patientId='" + patientId + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", paid=" + paid +
                '}';
    }
}
