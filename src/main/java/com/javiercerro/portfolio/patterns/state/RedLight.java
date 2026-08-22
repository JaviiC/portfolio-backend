package com.javiercerro.portfolio.patterns.state;

public class RedLight implements LightState {

    public static final RedLight INSTANCE = new RedLight();

    @Override
    public LightState timer() throws InterruptedException {
        Thread.sleep(4500);
        return GreenLight.INSTANCE;
    }

    @Override
    public LightState botonPeatonalPresionado() {
        return this;
    }

    @Override
    public LightState error() {
        return WarningLight.INSTANCE;
    }

    @Override
    public LightState reset() {
        return this;
    }
}
