package com.javiercerro.portfolio.patterns.state;

public final class RedState implements TrafficLightState {
    @Override
    public TrafficLightState next() {
        return new GreenState();
    }

    @Override
    public String label() {
        return "ROJO";
    }
}
