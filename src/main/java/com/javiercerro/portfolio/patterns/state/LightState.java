package com.javiercerro.portfolio.patterns.state;

public interface LightState {
    LightState timer() throws InterruptedException;
    LightState botonPeatonalPresionado() throws InterruptedException;
    LightState error();
    LightState reset() throws InterruptedException;
}
