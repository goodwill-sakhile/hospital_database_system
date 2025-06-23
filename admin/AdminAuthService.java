package com.hms.admin;

import java.util.HashMap;
import java.util.Map;

public class AdminAuthService {
    private final Map<String, String> credentials = new HashMap<>();

    public AdminAuthService() {
        credentials.put("admin", "password123");  // replace in real systems
    }

    public boolean login(String username, String password) {
        return credentials.containsKey(username) && credentials.get(username).equals(password);
    }
}
