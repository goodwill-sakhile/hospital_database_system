package com.hms.service;

import com.hms.model.Appointment;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles appointment-related logic.
 */
public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

    public void scheduleAppointment(Appointment appt) {
        appointments.add(appt);
        System.out.println("Appointment scheduled for patient ID: " + appt.getPatientId());
    }

    public List<Appointment> getAppointmentsForDoctor(String doctorId) {
        List<Appointment> result = new ArrayList<>();
        for (Appointment a : appointments) {
            if (a.getDoctorId().equals(doctorId)) {
                result.add(a);
            }
        }
        return result;
    }

    public void cancelAppointment(String id) {
        appointments.removeIf(a -> a.getId().equals(id));
        System.out.println("Appointment canceled.");
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }
}
