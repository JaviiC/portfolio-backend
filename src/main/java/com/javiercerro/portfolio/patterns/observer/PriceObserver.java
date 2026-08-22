package com.javiercerro.portfolio.patterns.observer;

public interface PriceObserver {
    void onPriceChanged(double newPrice);
    String name();
}
