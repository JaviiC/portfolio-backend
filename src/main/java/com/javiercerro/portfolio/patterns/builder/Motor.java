package com.javiercerro.portfolio.patterns.builder;

public class Motor {

    public String name;

    public Motor(){}

    public Motor(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
