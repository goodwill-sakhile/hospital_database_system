package com.hms.scheduling;

import java.time.LocalDateTime;

public class Shift {
    private String doctorId;
    private LocalDateTime start;
    private LocalDateTime end;

    public Shift(String doctorId, LocalDateTime start, LocalDateTime end) {
        this.doctorId = doctorId;
        this.start = start;
        this.end = end;
    }

    public String getDoctorId() { return doctorId; }
    public LocalDateTime getStart() { return start; }
    public LocalDateTime getEnd() { return end; }

    @Override
    public String toString() {
        return "Doctor " + doctorId + ": " + start + " to " + end;
    }
}
