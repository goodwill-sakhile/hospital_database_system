package com.hms.test;

import com.hms.model.Doctor;
import com.hms.service.DoctorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorServiceTest {

    @Test
    void testAddAndFindDoctor() {
        DoctorService service = new DoctorService();
        Doctor d = new Doctor("D001", "Dr. Joe", "Cardiology", "0787654321", "joe@doc.com");
        service.addDoctor(d);

        Doctor result = service.findById("D001");
        assertNotNull(result);
        assertEquals("Dr. Joe", result.getName());
    }
}
