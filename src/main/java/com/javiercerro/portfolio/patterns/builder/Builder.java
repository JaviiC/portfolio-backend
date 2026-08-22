package com.javiercerro.portfolio.patterns.builder;

public interface Builder {
    void reset();
    void setTipo(TipoVehiculo tipo);
    void fabricarMotor(Motor motor);
    void gestionarTransmision(Transmision transmision);
    void pintarInterior(String colorI);
    void pintarExterior(String colorE);
    void aniadirPaquete(Paquete paquete);
    void aniadirCaracteristica(Caracteristica caracteristica);
    Vehiculo fabricarVehiculo();
}
