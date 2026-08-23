package com.javiercerro.portfolio.patterns.builder;

import java.util.HashSet;
import java.util.Set;

public class Vehicle {

    private VehicleType type;
    private Motor motor;
    private Transmission transmission;
    private String colorInterior;
    private String colorExterior;
    private Set<Package> packages;
    private Set<Feature> features;

    public Vehicle(){
        this("Negro", "Blanco y Azul");
        packages = new HashSet<>();
        features = new HashSet<>();
    }

    public Vehicle(String colorInterior, String colorExterior){
        this.colorInterior = colorInterior;
        this.colorExterior = colorExterior;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getColorInterior() {
        return colorInterior;
    }

    public void setColorInterior(String colorInterior) {
        this.colorInterior = colorInterior;
    }

    public String getColorExterior() {
        return colorExterior;
    }

    public void setColorExterior(String colorExterior) {
        this.colorExterior = colorExterior;
    }

    public Set<Package> getPackages() {
        return packages;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void addPackage(Package aPackage){
        this.packages.add(aPackage);
    }

    public void aniadirCaracteristica(Feature feature){
        this.features.add(feature);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo=" + type +
                ", motor=" + motor +
                ", transmision=" + transmission +
                ", colorInterior='" + colorInterior + '\'' +
                ", colorExterior='" + colorExterior + '\'' +
                ", packages=" + packages +
                ", features=" + features +
                '}';
    }
}
