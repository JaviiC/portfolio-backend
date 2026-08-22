package com.javiercerro.portfolio.patterns.singleton;

import com.javiercerro.portfolio.patterns.command.exception.DivisionPorCeroException;

public final class Calculator {

    private static Calculator instance;
    private double total;

    private Calculator(){
        total = 0;
    }

    public static Calculator getInstance(){
        if(instance == null)
            instance = new Calculator();
        return instance;
    }

    protected double suma(int n){
        return total += n;
    }

    protected double resta(int n){
        return total -= n;
    }

    protected double multiplica(int n){
        return total *= n;
    }

    protected double divide(int n) {
        if(n == 0)
            throw new DivisionPorCeroException();
        return total /= n;
    }

    protected void set(int n){
        total = n;
    }

    public double getTotal(){
        return total;
    }

}
