package com.javiercerro.portfolio.patterns.builder;

public interface Builder {
    void reset();
    void setType(VehicleType tipo);
    void makeMotor(Motor motor);
    void manageTransmission(Transmission transmission);
    void paintInterior(String colorI);
    void paintExterior(String colorE);
    void addPackage(Package aPackage);
    void addFeature(Feature feature);
    Vehicle produceVehicle();
}
