package com.javiercerro.portfolio.patterns.state;

public class TrafficLight {
    private TrafficLightState state = new RedState();

    public TrafficLightState advance() {
        this.state = state.next();
        return state;
    }

    public TrafficLightState current() {
        return state;
    }
}
