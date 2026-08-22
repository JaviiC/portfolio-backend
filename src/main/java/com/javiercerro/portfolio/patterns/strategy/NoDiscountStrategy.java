package com.javiercerro.portfolio.patterns.strategy;

public final class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double apply(double amount) {
        return amount;
    }

    @Override
    public String describe() {
        return "Sin descuento";
    }
}
