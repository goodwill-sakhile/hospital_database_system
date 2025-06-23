package com.hms.reporting;

import com.hms.model.Appointment;
import com.hms.repository.AppointmentRepository;

import java.util.List;

/**
 * Shows upcoming appointments.
 */
public class AppointmentReport implements ReportGenerator {
    private final AppointmentRepository repo;

    public AppointmentReport(AppointmentRepository repo) {
        this.repo = repo;
    }

    @Override
    public void generateReport() {
        List<Appointment> appointments = repo.findAll();
        System.out.println("=== Appointment Report ===");
        for (Appointment a : appointments) {
            System.out.println(a.getId() + " - Dr." + a.getDoctorId() + " -> Patient " + a.getPatientId() + " @ " + a.getDateTime());
        }
    }
}
