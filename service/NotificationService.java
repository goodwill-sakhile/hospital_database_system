package com.hms.service;

/**
 * Simulates sending notifications.
 */
public class NotificationService {

    public void sendEmail(String to, String subject, String body) {
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }

    public void sendSMS(String to, String message) {
        System.out.println("Sending SMS to: " + to);
        System.out.println("Message: " + message);
    }
}
