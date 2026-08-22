package com.javiercerro.portfolio.patterns.builder;

import java.util.HashSet;
import java.util.Set;

public class Vehiculo {

    private TipoVehiculo tipo;
    private Motor motor;
    private Transmision transmision;
    private String colorInterior;
    private String colorExterior;
    private Set<Paquete> paquetes;
    private Set<Caracteristica> caracteristicas;

    public Vehiculo(){
        this("Negro", "Blanco y Azul");
        paquetes = new HashSet<>();
        caracteristicas = new HashSet<>();
    }

    public Vehiculo(String colorInterior, String colorExterior){
        this.colorInterior = colorInterior;
        this.colorExterior = colorExterior;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
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

    public Set<Paquete> getPaquetes() {
        return paquetes;
    }

    public Set<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public void aniadirPaquete(Paquete paquete){
        this.paquetes.add(paquete);
    }

    public void aniadirCaracteristica(Caracteristica caracteristica){
        this.caracteristicas.add(caracteristica);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo=" + tipo +
                ", motor=" + motor +
                ", transmision=" + transmision +
                ", colorInterior='" + colorInterior + '\'' +
                ", colorExterior='" + colorExterior + '\'' +
                ", paquetes=" + paquetes +
                ", caracteristicas=" + caracteristicas +
                '}';
    }
}
