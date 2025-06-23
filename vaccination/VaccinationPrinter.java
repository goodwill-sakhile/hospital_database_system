package com.hms.vaccination;

import java.util.List;

public class VaccinationPrinter {

    public static void printRecords(List<VaccinationRecord> records) {
        System.out.println("=== Vaccination Records ===");
        for (VaccinationRecord r : records) {
            System.out.println(r);
        }
    }

    public static void printSchedules(List<VaccinationSchedule> schedules) {
        System.out.println("=== Upcoming Vaccination Schedules ===");
        for (VaccinationSchedule s : schedules) {
            System.out.println(s);
        }
    }
}
