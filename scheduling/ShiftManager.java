package com.hms.scheduling;

import java.util.ArrayList;
import java.util.List;

public class ShiftManager {
    private final List<Shift> shifts = new ArrayList<>();

    public void assignShift(Shift shift) {
        shifts.add(shift);
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public List<Shift> getShiftsForDoctor(String doctorId) {
        List<Shift> result = new ArrayList<>();
        for (Shift s : shifts) {
            if (s.getDoctorId().equals(doctorId)) result.add(s);
        }
        return result;
    }
}
