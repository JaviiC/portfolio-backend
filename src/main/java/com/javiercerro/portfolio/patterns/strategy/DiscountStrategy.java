package com.javiercerro.portfolio.patterns.strategy;

public sealed interface DiscountStrategy permits NoDiscountStrategy, PercentageDiscountStrategy, FixedDiscountStrategy {
    double apply(double amount);
    String describe();
}
