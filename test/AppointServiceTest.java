package com.hms.test;

import com.hms.model.Appointment;
import com.hms.service.AppointmentService;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentServiceTest {

    @Test
    void testScheduleAndCancelAppointment() {
        AppointmentService service = new AppointmentService();
        Appointment a = new Appointment("A1", "P1", "D1", LocalDateTime.now(), "Check-up");
        service.scheduleAppointment(a);

        List<Appointment> list = service.getAppointmentsForDoctor("D1");
        assertEquals(1, list.size());

        service.cancelAppointment("A1");
        assertTrue(service.getAppointmentsForDoctor("D1").isEmpty());
    }
}
