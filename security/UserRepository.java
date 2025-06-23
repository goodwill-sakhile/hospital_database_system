package com.hms.security;

import java.util.HashMap;
import java.util.Map;

/**
 * In-memory store for users.
 */
public class UserRepository {
    private final Map<String, User> users = new HashMap<>();

    public void save(User user) {
        users.put(user.getUsername(), user);
    }

    public User findByUsername(String username) {
        return users.get(username);
    }

    public boolean exists(String username) {
        return users.containsKey(username);
    }
}
