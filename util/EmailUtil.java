package com.hms.util;

/**
 * Simulates email sending.
 */
public class EmailUtil {

    public static void sendEmail(String to, String subject, String body) {
        System.out.println("Email sent to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + body);
    }
}
