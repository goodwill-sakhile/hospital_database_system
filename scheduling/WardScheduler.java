package com.hms.scheduling;

import java.util.ArrayList;
import java.util.List;

public class WardScheduler {
    private final List<WardSchedule> rotations = new ArrayList<>();

    public void assign(String wardId, String nurseId, String rotationTime) {
        rotations.add(new WardSchedule(wardId, nurseId, rotationTime));
    }

    public void printAll() {
        System.out.println("=== Ward Rotation Schedule ===");
        for (WardSchedule ws : rotations) {
            System.out.println(ws);
        }
    }
}
