package com.javiercerro.portfolio.patterns.state;

public class YellowLight implements LightState {

    public static final YellowLight INSTANCE = new YellowLight();

    @Override
    public LightState timer() throws InterruptedException {
        Thread.sleep(2000);
        return RedLight.INSTANCE;
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
