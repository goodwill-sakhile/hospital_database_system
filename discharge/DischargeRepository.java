package com.hms.discharge;

import java.util.ArrayList;
import java.util.List;

public class DischargeRepository {
    private final List<DischargeRecord> records = new ArrayList<>();

    public void addRecord(DischargeRecord record) {
        records.add(record);
    }

    public List<DischargeRecord> getAll() {
        return records;
    }
}
