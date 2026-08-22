package com.javiercerro.portfolio.patterns.factory;

/**
 * FACTORY METHOD.
 * El código cliente pide un tipo de notificación por nombre y no necesita
 * conocer ni importar las clases concretas (EmailNotification, SmsNotification...).
 */
public class NotificationFactory {
    public static Notification create(String type) {
        return switch (type.toUpperCase()) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SmsNotification();
            default -> throw new IllegalArgumentException("Tipo de notificación desconocido: " + type);
        };
    }
}
