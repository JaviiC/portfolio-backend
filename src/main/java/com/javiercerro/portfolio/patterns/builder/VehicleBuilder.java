package com.javiercerro.portfolio.patterns.builder;

public class VehicleBuilder implements Builder{

    private Vehicle vehicle = new Vehicle();

    @Override
    public void reset() {
        vehicle = new Vehicle();
    }

    @Override
    public void setType(VehicleType tipo) {
        if(vehicle.getType() == null)
            vehicle.setType(tipo);
    }

    @Override
    public void makeMotor(Motor motor) {
        vehicle.setMotor(motor);
    }

    @Override
    public void manageTransmission(Transmission transmission) {
        if(vehicle.getTransmission() == null)
            vehicle.setTransmission(transmission);
    }

    @Override
    public void paintInterior(String colorI) {
        vehicle.setColorInterior(colorI);
    }

    @Override
    public void paintExterior(String colorE) {
        vehicle.setColorExterior(colorE);
    }

    @Override
    public void addPackage(Package aPackage) {
        vehicle.addPackage(aPackage);
    }

    @Override
    public void addFeature(Feature feature) {
        vehicle.aniadirCaracteristica(feature);
    }

    @Override
    public Vehicle produceVehicle() {
        if(vehicle.getType() != null
                && vehicle.getMotor() != null
                && vehicle.getTransmission() != null
                && !vehicle.getPackages().isEmpty()
                && !vehicle.getFeatures().isEmpty()){
            return vehicle;
        }
        throw new RuntimeException("Error al fabricar, vehículo incompleto -> " + vehicle.toString());
    }
}
