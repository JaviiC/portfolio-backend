package com.javiercerro.portfolio.patterns.strategy;

public final class FixedDiscountStrategy implements DiscountStrategy {
    private final double fixedAmount;

    public FixedDiscountStrategy(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public double apply(double amount) {
        return Math.max(0, Math.round((amount - fixedAmount) * 100.0) / 100.0);
    }

    @Override
    public String describe() {
        return "%.2f € de descuento fijo".formatted(fixedAmount);
    }
}
