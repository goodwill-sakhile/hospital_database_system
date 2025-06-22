package com.hms.cli;

/**
 * Simulates a user session context.
 */
public class UserSession {
    private String loggedInUser;

    public void login(String userId) {
        this.loggedInUser = userId;
    }

    public void logout() {
        this.loggedInUser = null;
    }

    public boolean isLoggedIn() {
        return loggedInUser != null;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }
}
