package com.javiercerro.portfolio.patterns.state;

public sealed interface TrafficLightState permits RedState, YellowState, GreenState {
    TrafficLightState next();
    String label();
}
