package com.hms.admin;

import java.util.Map;

public class HospitalStats {

    public void printSystemStats(Map<String, Integer> map) {
        System.out.println("=== Hospital System Stats ===");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
