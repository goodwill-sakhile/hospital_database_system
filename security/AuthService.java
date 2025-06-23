package com.hms.security;

public class AuthService {
    private final UserRepository repo;

    public AuthService(UserRepository repo) {
        this.repo = repo;
    }

    public boolean authenticate(String username, String password) {
        User user = repo.findByUsername(username);
        if (user == null) return false;
        String hash = PasswordHasher.hash(password);
        return hash.equals(user.getPasswordHash());
    }
}
