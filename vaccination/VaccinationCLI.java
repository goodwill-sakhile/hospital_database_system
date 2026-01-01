package com.hms.vaccination;

import java.util.Scanner;

public class VaccinationCLI {
    private final VaccinationManager manager;
    private final VaccinationService service;

    public VaccinationCLI(VaccinationManager manager, VaccinationService service) {
        this.manager = manager;
        this.service = service;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Vaccination Management ===");
        System.out.print("Patient ID: ");
        String pid = sc.nextLine();

        System.out.println("Select Vaccine Type:");
        for (VaccineType vt : VaccineType.values()) {
            System.out.println(vt);
        }
        String vtype = sc.nextLine().toUpperCase();

        Vaccine vaccine = new Vaccine("VX" + vtype.hashCode(), VaccineType.valueOf(vtype), 3);

        System.out.print("Dose Number to administer: ");
        int dose = sc.nextInt();

        manager.administerDose(pid, vaccine, dose);

        System.out.println("\nPatient Vaccination History:");
        VaccinationPrinter.printRecords(service.getPatientVaccinations(pid));

        System.out.println("\nUpcoming Schedules:");
        VaccinationPrinter.printSchedules(service.getAllSchedules());
    }
}
