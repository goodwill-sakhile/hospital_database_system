package com.hms.scheduling;

import java.time.LocalDateTime;

public class Schedule {
    private String id;
    private String assignedTo;
    private String task;
    private LocalDateTime start;
    private LocalDateTime end;

    public Schedule(String id, String assignedTo, String task, LocalDateTime start, LocalDateTime end) {
        this.id = id;
        this.assignedTo = assignedTo;
        this.task = task;
        this.start = start;
        this.end = end;
    }

    public String getId() { return id; }
    public String getAssignedTo() { return assignedTo; }
    public String getTask() { return task; }
    public LocalDateTime getStart() { return start; }
    public LocalDateTime getEnd() { return end; }

    @Override
    public String toString() {
        return "[" + start + " - " + end + "] " + assignedTo + " -> " + task;
    }
}
