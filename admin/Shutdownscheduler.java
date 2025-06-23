package com.hms.admin;

import java.util.Timer;
import java.util.TimerTask;

public class ShutdownScheduler {
    public void scheduleShutdown(long milliseconds) {
        Timer timer = new Timer();
        System.out.println("Shutdown scheduled in " + milliseconds / 1000 + " seconds.");
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("System shutting down now.");
                System.exit(0);
            }
        }, milliseconds);
    }
}
