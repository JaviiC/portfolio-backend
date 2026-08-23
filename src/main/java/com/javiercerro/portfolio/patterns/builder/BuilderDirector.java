package com.javiercerro.portfolio.patterns.builder;

public class BuilderDirector {

    public void fabricarVehiculoSuv(VehicleBuilder builder){
        builder.setType(VehicleType.SUV);
        builder.makeMotor(new Motor());
        builder.manageTransmission(Transmission.MANUAL);
        builder.addPackage(Package.BASICO);
        builder.addFeature(Feature.ASISTENTE_AUTOPISTA);
        builder.addFeature(Feature.SISTEMA_NAVEGACION);
        builder.addFeature(Feature.TUBO_DE_ESCAPE_DOBLE);
    }

    public void fabricarVehiculoHatchback(VehicleBuilder builder){
        builder.setType(VehicleType.HATCHBACK);
        builder.makeMotor(new Motor("Hatckback 1.6vs"));
        builder.manageTransmission(Transmission.AUTOMATIC);
        // TODO
    }

    public void fabricarVehiculoDeportivo(VehicleBuilder builder){
        builder.setType(VehicleType.DEPORTIVO);
        builder.paintInterior("red");
        builder.paintExterior("black");
        builder.makeMotor(new Motor("gt 3.9vs"));
        builder.manageTransmission(Transmission.AUTOMATIC);
        builder.addPackage(Package.DEPORTIVO);
        builder.addFeature(Feature.ALERON_TRASERO);
        builder.addFeature(Feature.ASIENTOS_CALEFACCION);
        builder.addFeature(Feature.TUBO_DE_ESCAPE_DOBLE);
    }

    public void fabricarVehiculoBerlina(VehicleBuilder builder){
        builder.setType(VehicleType.BERLINA);
        builder.makeMotor(new Motor("berlina"));
        // TODO
    }

}
