package com.hms.security;

public class AccessControl {

    public static void check(Role required) {
        if (!SessionManager.isLoggedIn() || SessionManager.getCurrentUser().getRole() != required) {
            throw new SecurityException("Access Denied: You must be " + required);
        }
    }

    public static boolean is(Role role) {
        return SessionManager.isLoggedIn() && SessionManager.getCurrentUser().getRole() == role;
    }
}
