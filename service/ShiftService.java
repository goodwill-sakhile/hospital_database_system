package com.hms.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages staff shifts.
 */
public class ShiftService {
    private Map<String, String> staffShifts = new HashMap<>();

    public void assignShift(String staffId, String shiftTime) {
        staffShifts.put(staffId, shiftTime);
        System.out.println("Shift assigned to staff ID: " + staffId);
    }

    public String getShift(String staffId) {
        return staffShifts.getOrDefault(staffId, "No shift assigned.");
    }

    public void removeShift(String staffId) {
        staffShifts.remove(staffId);
        System.out.println("Shift removed for staff ID: " + staffId);
    }
}
