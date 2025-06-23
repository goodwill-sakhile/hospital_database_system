package com.hms.vaccination;

import java.util.ArrayList;
import java.util.List;

public class VaccinationRepository {
    private final List<VaccinationRecord> records = new ArrayList<>();
    private final List<VaccinationSchedule> schedules = new ArrayList<>();

    public void addRecord(VaccinationRecord record) {
        records.add(record);
    }

    public List<VaccinationRecord> getRecordsForPatient(String patientId) {
        List<VaccinationRecord> result = new ArrayList<>();
        for (VaccinationRecord r : records) {
            if (r.getPatientId().equals(patientId)) {
                result.add(r);
            }
        }
        return result;
    }

    public void addSchedule(VaccinationSchedule schedule) {
        schedules.add(schedule);
    }

    public List<VaccinationSchedule> getSchedules() {
        return schedules;
    }
}
