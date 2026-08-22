package com.javiercerro.portfolio.patterns.state;

public class GreenLight implements LightState {

    public static final GreenLight INSTANCE = new GreenLight();

    @Override
    public LightState timer() throws InterruptedException {
        Thread.sleep(8500);
        return YellowLight.INSTANCE;
    }

    @Override
    public LightState botonPeatonalPresionado() throws InterruptedException {
        Thread.sleep(1400);
        return YellowLight.INSTANCE;
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
