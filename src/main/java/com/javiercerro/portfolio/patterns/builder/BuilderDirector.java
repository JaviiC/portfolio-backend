package com.javiercerro.portfolio.patterns.builder;

public class BuilderDirector {

    public void fabricarVehiculoSuv(VehicleBuilder builder){
        builder.setTipo(VehicleType.SUV);
        builder.fabricarMotor(new Motor());
        builder.gestionarTransmision(Transmission.MANUAL);
        builder.aniadirPaquete(Packet.BASICO);
        builder.aniadirCaracteristica(Feature.ASISTENTE_AUTOPISTA);
        builder.aniadirCaracteristica(Feature.SISTEMA_NAVEGACION);
        builder.aniadirCaracteristica(Feature.TUBO_DE_ESCAPE_DOBLE);
    }

    public void fabricarVehiculoHatchback(VehicleBuilder builder){
        builder.setTipo(VehicleType.HATCHBACK);
        builder.fabricarMotor(new Motor());
        // TODO
    }

    public void fabricarVehiculoDeportivo(VehicleBuilder builder){
        builder.setTipo(VehicleType.DEPORTIVO);
        builder.fabricarMotor(new Motor());
        // TODO
    }

    public void fabricarVehiculoBerlina(VehicleBuilder builder){
        builder.setTipo(VehicleType.BERLINA);
        builder.fabricarMotor(new Motor("berlina"));
        // TODO
    }

}
