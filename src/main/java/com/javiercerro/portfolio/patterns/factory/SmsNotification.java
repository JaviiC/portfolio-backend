package com.javiercerro.portfolio.patterns.factory;

public class SmsNotification implements Notification {
    @Override
    public String send(String message) {
        return "SMS enviado: \"" + message + "\"";
    }
}
