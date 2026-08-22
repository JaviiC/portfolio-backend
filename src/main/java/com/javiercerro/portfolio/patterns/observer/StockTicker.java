package com.javiercerro.portfolio.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * OBSERVER — el "sujeto" mantiene una lista de observadores y los avisa
 * cuando cambia el precio, sin saber nada de su lógica interna.
 */
public class StockTicker {
    private final List<PriceObserver> observers = new ArrayList<>();
    private double price = 100.0;

    public void subscribe(PriceObserver observer) {
        observers.add(observer);
    }

    public List<String> updatePrice(double newPrice) {
        this.price = newPrice;
        List<String> triggered = new ArrayList<>();
        for (PriceObserver observer : observers) {
            observer.onPriceChanged(newPrice);
            triggered.add(observer.name());
        }
        return triggered;
    }

    public double price() {
        return price;
    }
}
