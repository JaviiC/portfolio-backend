package com.javiercerro.portfolio.patterns.builder;

public interface Builder {
    void reset();
    void setTipo(VehicleType tipo);
    void fabricarMotor(Motor motor);
    void gestionarTransmision(Transmission transmission);
    void pintarInterior(String colorI);
    void pintarExterior(String colorE);
    void aniadirPaquete(Packet packet);
    void aniadirCaracteristica(Feature feature);
    Vehiculo fabricarVehiculo();
}
