package com.javiercerro.portfolio.patterns.state;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore();

        semaphore.timer();
        semaphore.botonPresionado();
        semaphore.reset();
        semaphore.timer();
        semaphore.botonPresionado();
        semaphore.error();
        semaphore.botonPresionado();
        semaphore.timer();
        semaphore.reset();
        semaphore.timer();
        semaphore.timer();
        semaphore.botonPresionado();
        semaphore.reset();
        semaphore.error();
        semaphore.timer();
        semaphore.reset();
        semaphore.botonPresionado();
        semaphore.timer();
        semaphore.botonPresionado();
        semaphore.timer();
    }

}
