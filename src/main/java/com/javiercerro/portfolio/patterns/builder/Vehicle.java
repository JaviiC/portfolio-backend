package com.javiercerro.portfolio.patterns.builder;

import java.util.HashSet;
import java.util.Set;

public class Vehicle {

    private VehicleType tipo;
    private Motor motor;
    private Transmission transmission;
    private String colorInterior;
    private String colorExterior;
    private Set<Packet> packets;
    private Set<Feature> features;

    public Vehicle(){
        this("Negro", "Blanco y Azul");
        packets = new HashSet<>();
        features = new HashSet<>();
    }

    public Vehicle(String colorInterior, String colorExterior){
        this.colorInterior = colorInterior;
        this.colorExterior = colorExterior;
    }

    public VehicleType getTipo() {
        return tipo;
    }

    public void setTipo(VehicleType tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Transmission getTransmision() {
        return transmission;
    }

    public void setTransmision(Transmission transmission) {
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

    public Set<Packet> getPaquetes() {
        return packets;
    }

    public Set<Feature> getCaracteristicas() {
        return features;
    }

    public void aniadirPaquete(Packet packet){
        this.packets.add(packet);
    }

    public void aniadirCaracteristica(Feature feature){
        this.features.add(feature);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo=" + tipo +
                ", motor=" + motor +
                ", transmision=" + transmission +
                ", colorInterior='" + colorInterior + '\'' +
                ", colorExterior='" + colorExterior + '\'' +
                ", paquetes=" + packets +
                ", caracteristicas=" + features +
                '}';
    }
}
