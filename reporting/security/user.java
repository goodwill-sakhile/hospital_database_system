package com.hms.security;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String passwordHash;
    private Role role;

    public User(String username, String passwordHash, Role role) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    public String getUsername() { return username; }
    public String getPasswordHash() { return passwordHash; }
    public Role getRole() { return role; }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
