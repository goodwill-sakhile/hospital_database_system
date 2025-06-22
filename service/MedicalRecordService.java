package com.hms.service;

import com.hms.model.MedicalRecord;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles operations on medical records.
 */
public class MedicalRecordService {
    private List<MedicalRecord> records = new ArrayList<>();

    public void addRecord(MedicalRecord record) {
        records.add(record);
        System.out.println("Medical record added for patient: " + record.getPatientId());
    }

    public List<MedicalRecord> getRecordsByPatientId(String patientId) {
        List<MedicalRecord> result = new ArrayList<>();
        for (MedicalRecord r : records) {
            if (r.getPatientId().equals(patientId)) {
                result.add(r);
            }
        }
        return result;
    }

    public List<MedicalRecord> getAllRecords() {
        return records;
    }
}
