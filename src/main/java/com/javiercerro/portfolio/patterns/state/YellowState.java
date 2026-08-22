package com.javiercerro.portfolio.patterns.state;

public final class YellowState implements TrafficLightState {
    @Override
    public TrafficLightState next() {
        return new RedState();
    }

    @Override
    public String label() {
        return "AMARILLO";
    }
}
