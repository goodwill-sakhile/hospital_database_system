package com.hms.test;

import com.hms.model.Patient;
import com.hms.service.PatientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientServiceTest {

    private PatientService service;

    @BeforeEach
    void setUp() {
        service = new PatientService();
    }

    @Test
    void testRegisterAndFindPatient() {
        Patient p = new Patient("P001", "Alice", "123 St", "0712345678", "alice@mail.com");
        service.registerPatient(p);

        Patient found = service.getPatientById("P001");
        assertNotNull(found);
        assertEquals("Alice", found.getName());
    }

    @Test
    void testDeletePatient() {
        Patient p = new Patient("P002", "Bob", "456 St", "0712345678", "bob@mail.com");
        service.registerPatient(p);
        service.deletePatient("P002");

        assertNull(service.getPatientById("P002"));
    }
}
