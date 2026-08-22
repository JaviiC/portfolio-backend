package com.javiercerro.portfolio.patterns.observer;

public class PriceAlertNotifier implements PriceObserver {
    @Override
    public void onPriceChanged(double newPrice) {
        // en una app real, aquí se dispararía una alerta si supera un umbral
    }

    @Override
    public String name() {
        return "PriceAlertNotifier";
    }
}
