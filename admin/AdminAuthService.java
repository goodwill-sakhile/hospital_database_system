package com.hms.admin;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class AdminAuthService {
    private final ConcurrentHashMap<String, String> credentials = new ConcurrentHashMap<>();

    public AdminAuthService() {
        // Add default admin (hashed password)
        addAdmin("admin", "password123");
    }

    /**
     * Adds a new admin with a username and plain password (will be hashed).
     * @param username admin username
     * @param password plain text password
     */
    public void addAdmin(String username, String password) {
        validateUsernamePassword(username, password);
        credentials.put(username, hashPassword(password));
    }

    /**
     * Removes an admin by username.
     * @param username admin username to remove
     * @return true if removed, false if not found
     */
    public boolean removeAdmin(String username) {
        return credentials.remove(username) != null;
    }

    /**
     * Attempts to login with given username and password.
     * @param username admin username
     * @param password plain text password
     * @return true if authentication succeeds, false otherwise
     */
    public boolean login(String username, String password) {
        validateUsernamePassword(username, password);

        return Optional.ofNullable(credentials.get(username))
            .map(storedHash -> storedHash.equals(hashPassword(password)))
            .orElse(false);
    }

    private void validateUsernamePassword(String username, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            // Convert bytes to hex string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Should never happen with SHA-256
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }
}
