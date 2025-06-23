package com.hms.test;

import com.hms.model.MedicalRecord;
import com.hms.service.MedicalRecordService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MedicalRecordServiceTest {

    @Test
    void testAddAndFetchRecords() {
        MedicalRecordService service = new MedicalRecordService();
        MedicalRecord record = new MedicalRecord("R001", "P1", "Flu", "Rest & meds", "D1");
        service.addRecord(record);

        List<MedicalRecord> list = service.getRecordsByPatientId("P1");
        assertEquals(1, list.size());
    }
}
