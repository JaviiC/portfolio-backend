package com.javiercerro.portfolio.patterns.state;

public class Semaphore {

    private LightState estadoActual = RedLight.INSTANCE;

    public Semaphore(){
        System.out.println("Semáforo ACTIVADO");
    }

    public void timer() throws InterruptedException {
        estadoActual = estadoActual.timer();
    }

    public void botonPresionado() throws InterruptedException {
        estadoActual = estadoActual.botonPeatonalPresionado();
    }

    public void error(){
        estadoActual = estadoActual.error();
    }

    public void reset() throws InterruptedException {
        estadoActual = estadoActual.reset();
    }

}

