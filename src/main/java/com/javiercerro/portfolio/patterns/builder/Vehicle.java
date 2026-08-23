package com.javiercerro.portfolio.patterns.builder;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Vehicle {

    private final VehicleType type;
    private final Motor motor;
    private final Transmission transmission;
    private final String interiorColor;
    private final String exteriorColor;
    private final Package apackage;
    private final Set<Feature> features;

    private Vehicle(Builder builder){
        this.type = builder.type;
        this.motor = builder.motor;
        this.transmission = builder.transmission;
        this.interiorColor = builder.interiorColor;
        this.exteriorColor = builder.exteriorColor;
        this.apackage = builder.apackage;
        this.features = Collections.unmodifiableSet(new HashSet<>(builder.features));
    }
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private VehicleType type;
        private Motor motor;
        private Transmission transmission;
        private String interiorColor;
        private String exteriorColor;
        private Package apackage;
        private Set<Feature> features = new HashSet<>();

        public Builder reset(){
            this.type = null;
            this.motor = null;
            this.transmission = null;
            this.interiorColor = null;
            this.exteriorColor = null;
            this.apackage = null;
            this.features = new HashSet<>();
            return this;
        }

        public Builder type(VehicleType vehicleType) {
            this.type = vehicleType;
            return this;
        }

        public Builder motor(Motor motor){
            this.motor = motor;
            return this;
        }

        public Builder transmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder interiorColor(String interiorColor) {
            this.interiorColor = interiorColor;
            return this;
        }

        public Builder exteriorColor(String exteriorColor){
            this.exteriorColor = exteriorColor;
            return this;
        }

        public Builder apackage(Package apackage) {
            this.apackage = apackage;
            return this;
        }

        public Builder addFeature(Feature feature) {
            this.features.add(feature);
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type=" + type +
                ", motor=" + motor +
                ", transmission=" + transmission +
                ", interiorColor='" + interiorColor + '\'' +
                ", exteriorColor='" + exteriorColor + '\'' +
                ", packages=" + apackage +
                ", features=" + features +
                '}';
    }
}
