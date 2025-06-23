package com.hms.scheduling;

import java.util.List;

public class SchedulePrinter {
    public static void printShifts(List<Shift> shifts) {
        System.out.println("=== Shift Schedules ===");
        for (Shift shift : shifts) {
            System.out.println(shift);
        }
    }

    public static void printRotations(List<WardSchedule> wards) {
        System.out.println("=== Nurse Rotations ===");
        for (WardSchedule ws : wards) {
            System.out.println(ws);
        }
    }
}
