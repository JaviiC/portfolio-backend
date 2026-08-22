package com.javiercerro.portfolio.patterns.builder;

public class VehicleBuilder implements Builder{

    private Vehicle vehicle = new Vehicle();

    @Override
    public void reset() {
        vehicle = new Vehicle();
    }

    @Override
    public void setTipo(VehicleType tipo) {
        if(vehicle.getTipo() == null)
            vehicle.setTipo(tipo);
    }

    @Override
    public void fabricarMotor(Motor motor) {
        vehicle.setMotor(motor);
    }

    @Override
    public void gestionarTransmision(Transmission transmission) {
        if(vehicle.getTransmision() == null)
            vehicle.setTransmision(transmission);
    }

    @Override
    public void pintarInterior(String colorI) {
        vehicle.setColorInterior(colorI);
    }

    @Override
    public void pintarExterior(String colorE) {
        vehicle.setColorExterior(colorE);
    }

    @Override
    public void aniadirPaquete(Packet packet) {
        vehicle.aniadirPaquete(packet);
    }

    @Override
    public void aniadirCaracteristica(Feature feature) {
        vehicle.aniadirCaracteristica(feature);
    }

    @Override
    public Vehicle fabricarVehiculo() {
        if(vehicle.getTipo() != null
                && vehicle.getMotor() != null
                && vehicle.getTransmision() != null
                && !vehicle.getPaquetes().isEmpty()
                && !vehicle.getCaracteristicas().isEmpty()){
            return vehicle;
        }
        throw new RuntimeException("Error al fabricar, vehículo incompleto -> " + vehicle.toString());
    }
}
