package com.javiercerro.portfolio.patterns.strategy;

public final class PercentageDiscountStrategy implements DiscountStrategy {
    private final double percentage;

    public PercentageDiscountStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double amount) {
        return Math.round(amount * (1 - percentage / 100.0) * 100.0) / 100.0;
    }

    @Override
    public String describe() {
        return "%.0f%% de descuento".formatted(percentage);
    }
}
