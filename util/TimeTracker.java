package com.hms.util;

/**
 * Simple stopwatch for tracking task duration.
 */
public class TimeTracker {
    private long start;

    public void start() {
        this.start = System.currentTimeMillis();
    }

    public void stopAndPrint(String taskName) {
        long end = System.currentTimeMillis();
        System.out.println(taskName + " took " + (end - start) + "ms");
    }
}
