package com.javiercerro.portfolio.patterns.builder;

public class Main {

    public static void main(String[] args) {

        BuilderDirector director = new BuilderDirector();
        VehicleBuilder builder = new VehicleBuilder();
        director.fabricarVehiculoSuv(builder);
        Vehicle vehicle = builder.fabricarVehiculo();

        System.out.println("Vehículo fabricado -> " + vehicle);

//        builder.reset();
//        builder.fabricarVehiculo();

    }

}
