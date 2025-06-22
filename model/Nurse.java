package com.hms.model;

/**
 * Represents a nurse working in the hospital.
 */
public class Nurse {
    private String id;
    private String name;
    private String shift;
    private String phone;
    private String email;

    public Nurse(String id, String name, String shift, String phone, String email) {
        this.id = id;
        this.name = name;
        this.shift = shift;
        this.phone = phone;
        this.email = email;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getShift() { return shift; }

    public void setShift(String shift) { this.shift = shift; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Nurse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shift='" + shift + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
