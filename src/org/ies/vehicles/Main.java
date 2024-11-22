package org.ies.vehicles;

import org.ies.vehicles.components.VehiculeReader;
import org.ies.vehicles.model.Vehicule;
import org.ies.vehicles.model.VehiculeType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehiculeReader vehiculeReader = new VehiculeReader(scanner);
        Vehicule vehicule = new Vehicule(
                VehiculeType.Car,
                "red",
                200,
                "abc2002"
        );
    }
}