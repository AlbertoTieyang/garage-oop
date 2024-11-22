package org.ies.vehicles.model;

import java.util.Objects;

public class Vehicule {
    private VehiculeType vehiculeType;
    private String color;
    private int maxSpeed;
    private String plate;

    public Vehicule(VehiculeType vehiculeType, String color, int maxSpeed, String plate) {
        this.vehiculeType = vehiculeType;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.plate = plate;
    }

    public VehiculeType getVehiculeType() {
        return vehiculeType;
    }

    public void setVehiculeType(VehiculeType vehiculeType) {
        this.vehiculeType = vehiculeType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return maxSpeed == vehicule.maxSpeed && Objects.equals(vehiculeType, vehicule.vehiculeType) && Objects.equals(color, vehicule.color) && Objects.equals(plate, vehicule.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehiculeType, color, maxSpeed, plate);
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "vehiculeType='" + vehiculeType + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", plate='" + plate + '\'' +
                '}';
    }

}
