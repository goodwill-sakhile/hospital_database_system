package com.hms.scheduling;

public class WardSchedule {
    private final String wardId;
    private final String nurseId;
    private final String rotationTime;

    public WardSchedule(String wardId, String nurseId, String rotationTime) {
        this.wardId = wardId;
        this.nurseId = nurseId;
        this.rotationTime = rotationTime;
    }

    @Override
    public String toString() {
        return "Nurse " + nurseId + " rotates to Ward " + wardId + " at " + rotationTime;
    }
}
