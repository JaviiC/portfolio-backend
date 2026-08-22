package com.javiercerro.portfolio.patterns.state;

public final class GreenState implements TrafficLightState {
    @Override
    public TrafficLightState next() {
        return new YellowState();
    }

    @Override
    public String label() {
        return "VERDE";
    }
}
