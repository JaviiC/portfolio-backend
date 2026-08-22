package com.javiercerro.portfolio.patterns.builder;

public class Main {

    public static void main(String[] args) {

        BuilderDirector director = new BuilderDirector();
        VehiculoBuilder builder = new VehiculoBuilder();
        director.fabricarVehiculoSuv(builder);
        Vehiculo vehiculo = builder.fabricarVehiculo();

        System.out.println("Vehículo fabricado -> " + vehiculo);

//        builder.reset();
//        builder.fabricarVehiculo();

    }

}
