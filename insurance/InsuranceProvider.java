package com.hms.insurance;

public class InsuranceProvider {
    private String name;
    private String contact;

    public InsuranceProvider(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() { return name; }
    public String getContact() { return contact; }
}
