package com.javiercerro.portfolio.patterns.state;

public class WarningLight implements LightState {

    public static final WarningLight INSTANCE = new WarningLight();

    @Override
    public LightState timer() {
        return this;
    }

    @Override
    public LightState botonPeatonalPresionado() {
        return this;
    }

    @Override
    public LightState error() {
        return this;
    }

    @Override
    public LightState reset() throws InterruptedException {
        Thread.sleep(8000);
        return RedLight.INSTANCE;
    }

}
