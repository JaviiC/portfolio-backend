package com.javiercerro.portfolio.patterns.builder;

public class BuilderDirector {

    public void fabricarVehiculoSuv(VehiculoBuilder builder){
        builder.setTipo(TipoVehiculo.SUV);
        builder.fabricarMotor(new Motor());
        builder.gestionarTransmision(Transmision.MANUAL);
        builder.aniadirPaquete(Paquete.BASICO);
        builder.aniadirCaracteristica(Caracteristica.ASISTENTE_AUTOPISTA);
        builder.aniadirCaracteristica(Caracteristica.SISTEMA_NAVEGACION);
        builder.aniadirCaracteristica(Caracteristica.TUBO_DE_ESCAPE_DOBLE);
    }

    public void fabricarVehiculoHatchback(VehiculoBuilder builder){
        builder.setTipo(TipoVehiculo.HATCHBACK);
        builder.fabricarMotor(new Motor());
        // TODO
    }

    public void fabricarVehiculoDeportivo(VehiculoBuilder builder){
        builder.setTipo(TipoVehiculo.DEPORTIVO);
        builder.fabricarMotor(new Motor());
        // TODO
    }

    public void fabricarVehiculoBerlina(VehiculoBuilder builder){
        builder.setTipo(TipoVehiculo.BERLINA);
        builder.fabricarMotor(new Motor("berlina"));
        // TODO
    }

}
