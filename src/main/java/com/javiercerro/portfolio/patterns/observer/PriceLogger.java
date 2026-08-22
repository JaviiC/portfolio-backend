package com.javiercerro.portfolio.patterns.observer;

public class PriceLogger implements PriceObserver {
    @Override
    public void onPriceChanged(double newPrice) {
        // en una app real, aquí se escribiría a un log/métricas
    }

    @Override
    public String name() {
        return "PriceLogger";
    }
}
