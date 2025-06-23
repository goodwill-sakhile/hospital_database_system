package com.hms.security;

public class UserService {
    private final UserRepository repo = new UserRepository();

    public void register(String username, String password, Role role) {
        if (repo.exists(username)) {
            throw new RuntimeException("Username already exists");
        }
        String hash = PasswordHasher.hash(password);
        repo.save(new User(username, hash, role));
    }

    public User findUser(String username) {
        return repo.findByUsername(username);
    }
}
