package com.hms.persistence;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Auto-saving every N milliseconds.
 */
public class AutoSaver {
    private final Timer timer = new Timer();

    public void start(Runnable task, long delay, long period) {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                task.run();
            }
        }, delay, period);
    }

    public void stop() {
        timer.cancel();
    }
}
