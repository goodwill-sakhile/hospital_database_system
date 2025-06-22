package com.hms.repository;

import com.hms.model.MedicalRecord;
import java.util.ArrayList;
import java.util.List;

/**
 * Repository for storing medical records.
 */
public class MedicalRecordRepository {
    private final List<MedicalRecord> records = new ArrayList<>();

    public void save(MedicalRecord record) {
        records.add(record);
    }

    public List<MedicalRecord> findByPatientId(String patientId) {
        List<MedicalRecord> result = new ArrayList<>();
        for (MedicalRecord r : records) {
            if (r.getPatientId().equals(patientId)) {
                result.add(r);
            }
        }
        return result;
    }

    public List<MedicalRecord> findAll() {
