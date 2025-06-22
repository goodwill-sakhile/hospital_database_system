package com.hms.repository;

import com.hms.model.Appointment;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles appointment data.
 */
public class AppointmentRepository {
    private final List<Appointment> appointments = new ArrayList<>();

    public void save(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> findAll() {
        return new ArrayList<>(appointments);
    }

    public void delete(String id) {
        appointments.removeIf(a -> a.getId().equals(id));
    }
}
