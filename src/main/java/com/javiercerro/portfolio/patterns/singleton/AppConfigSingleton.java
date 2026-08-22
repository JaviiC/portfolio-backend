package com.javiercerro.portfolio.patterns.singleton;

/**
 * SINGLETON clásico: constructor privado + instancia estática única.
 * (En el resto del proyecto, cuando hace falta una única instancia compartida,
 * se usa directamente un bean de Spring — ver banking/repository — que logra
 * lo mismo sin escribir este boilerplate a mano. Aquí se enseña la versión
 * "de libro" del patrón.)
 */
public final class AppConfigSingleton {

    private static final AppConfigSingleton INSTANCE = new AppConfigSingleton();

    private final String appName = "primeofstudio-lab";
    private int requestCount = 0;

    private AppConfigSingleton() {}

    public static AppConfigSingleton getInstance() {
        return INSTANCE;
    }

    public synchronized int registerRequest() {
        return ++requestCount;
    }

    public String appName() {
        return appName;
    }

    public int identity() {
        return System.identityHashCode(this);
    }
}
