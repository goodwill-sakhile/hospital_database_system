package com.hms.emergency;

import java.util.Scanner;

public class EmergencyIntake {
    private final TriageManager manager;

    public EmergencyIntake(TriageManager manager) {
        this.manager = manager;
    }

    public void intake() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Emergency Intake ===");
        System.out.print("Patient ID: ");
        String id = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Symptoms: ");
        String symptoms = sc.nextLine();
        System.out.print("Triage Level (RED, ORANGE, YELLOW, GREEN, BLUE): ");
        String level = sc.nextLine();

        manager.assessAndAdd(id, name, TriageLevel.valueOf(level.toUpperCase()), symptoms);
    }
}
