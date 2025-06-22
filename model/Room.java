package com.hms.model;

/**
 * Represents a hospital room.
 */
public class Room {
    private String number;
    private String type;
    private boolean occupied;

    public Room(String number, String type, boolean occupied) {
        this.number = number;
        this.type = type;
        this.occupied = occupied;
    }

    public String getNumber() { return number; }

    public String getType() { return type; }

    public boolean isOccupied() { return occupied; }

    public void setOccupied(boolean occupied) { this.occupied = occupied; }

    @Override
    public String toString() {
        return "Room{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", occupied=" + occupied +
                '}';
    }
}
