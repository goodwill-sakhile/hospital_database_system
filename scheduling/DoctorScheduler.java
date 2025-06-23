package com.hms.scheduling;

import java.time.LocalDateTime;

public class DoctorScheduler {
    private final ShiftManager shiftManager;

    public DoctorScheduler(ShiftManager manager) {
        this.shiftManager = manager;
    }

    public void scheduleShift(String doctorId, LocalDateTime start, LocalDateTime end) {
        shiftManager.assignShift(new Shift(doctorId, start, end));
        System.out.println("Shift scheduled for Doctor " + doctorId);
    }

    public void printSchedule(String doctorId) {
        for (Shift s : shiftManager.getShiftsForDoctor(doctorId)) {
            System.out.println(s);
        }
    }
}
