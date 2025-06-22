package com.hms.model;

/**
 * Represents a doctor in the hospital.
 */
public class Doctor {
    private String id;
    private String name;
    private String specialization;
    private String phone;
    private String email;
    private String department;

    public Doctor(String id, String name, String specialization, String phone, String email, String department) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
        this.email = email;
        this.department = department;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }

    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }

    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
