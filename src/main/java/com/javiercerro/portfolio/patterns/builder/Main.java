package com.javiercerro.portfolio.patterns.builder;

public class Main {

    public static void main(String[] args) {

        BuilderDirector director = new BuilderDirector();
        VehicleBuilder builder = new VehicleBuilder();
        director.fabricarVehiculoSuv(builder);
        Vehicle vehicle = builder.produceVehicle();

        System.out.println("Vehículo SUV fabricado -> " + vehicle);

        builder.reset();
        director.fabricarVehiculoDeportivo(builder);
        vehicle = builder.produceVehicle();

        System.out.println("Vehículo DEPORTIVO fabricado -> " + vehicle);

//        builder.reset();
//        builder.fabricarVehiculo();

    }

}
