package com.hms.vaccination;

public class VaccinationValidator {

    public static boolean canAdministerDose(Vaccine vaccine, int currentDose, int requestedDose) {
        if (requestedDose <= currentDose) {
            System.out.println("Requested dose already administered.");
            return false;
        }
        if (requestedDose > vaccine.getRequiredDoses()) {
            System.out.println("Requested dose exceeds required doses.");
            return false;
        }
        return true;
    }
}
