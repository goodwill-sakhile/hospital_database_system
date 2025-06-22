package com.hms.model;

/**
 * Represents a hospital department.
 */
public class Department {
    private String name;
    private String head;
    private int floor;

    public Department(String name, String head, int floor) {
        this.name = name;
        this.head = head;
        this.floor = floor;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getHead() { return head; }

    public void setHead(String head) { this.head = head; }

    public int getFloor() { return floor; }

    public void setFloor(int floor) { this.floor = floor; }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head='" + head + '\'' +
                ", floor=" + floor +
                '}';
    }
}
