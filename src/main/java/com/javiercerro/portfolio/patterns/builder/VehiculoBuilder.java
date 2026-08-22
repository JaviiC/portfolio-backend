package com.javiercerro.portfolio.patterns.builder;

public class VehiculoBuilder implements Builder{

    private Vehiculo vehiculo = new Vehiculo();

    @Override
    public void reset() {
        vehiculo = new Vehiculo();
    }

    @Override
    public void setTipo(VehicleType tipo) {
        if(vehiculo.getTipo() == null)
            vehiculo.setTipo(tipo);
    }

    @Override
    public void fabricarMotor(Motor motor) {
        vehiculo.setMotor(motor);
    }

    @Override
    public void gestionarTransmision(Transmission transmission) {
        if(vehiculo.getTransmision() == null)
            vehiculo.setTransmision(transmission);
    }

    @Override
    public void pintarInterior(String colorI) {
        vehiculo.setColorInterior(colorI);
    }

    @Override
    public void pintarExterior(String colorE) {
        vehiculo.setColorExterior(colorE);
    }

    @Override
    public void aniadirPaquete(Packet packet) {
        vehiculo.aniadirPaquete(packet);
    }

    @Override
    public void aniadirCaracteristica(Feature feature) {
        vehiculo.aniadirCaracteristica(feature);
    }

    @Override
    public Vehiculo fabricarVehiculo() {
        if(vehiculo.getTipo() != null
                && vehiculo.getMotor() != null
                && vehiculo.getTransmision() != null
                && !vehiculo.getPaquetes().isEmpty()
                && !vehiculo.getCaracteristicas().isEmpty()){
            return vehiculo;
        }
        throw new RuntimeException("Error al fabricar, vehículo incompleto -> " + vehiculo.toString());
    }
}
