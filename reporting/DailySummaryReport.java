package com.hms.reporting;

import com.hms.repository.*;

public class DailySummaryReport {
    private final PatientRepository patients;
    private final DoctorRepository doctors;
    private final BillingRepository billing;
    private final AppointmentRepository appointments;

    public DailySummaryReport(PatientRepository p, DoctorRepository d, BillingRepository b, AppointmentRepository a) {
        this.patients = p;
        this.doctors = d;
        this.billing = b;
        this.appointments = a;
    }

    public void print() {
        System.out.println("=== Daily Hospital Summary ===");
        System.out.println("Total Patients: " + patients.findAll().size());
        System.out.println("Total Doctors: " + doctors.findAll().size());
        System.out.println("Total Bills: " + billing.findAll().size());
        System.out.println("Scheduled Appointments: " + appointments.findAll().size());
    }
}
