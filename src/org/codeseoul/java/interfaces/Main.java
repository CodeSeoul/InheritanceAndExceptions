package org.codeseoul.java.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IFuelable> fuelables = new ArrayList<>();

        IVehicle vehicle = new Car(2);
        fuelables.add(vehicle);

        IFuelable generator = new Generator();
        fuelables.add(generator);

        for (IFuelable fuelable : fuelables) {
            fuelable.addFuel(60);
        }

        vehicle.start();
        vehicle.drive(15);

        System.out.println("Generator has " + generator.getFuel() + " fuel.");

        try {
            vehicle.drive(100);
        } catch (OutOfFuelException e) {
            System.out.println("Stopping for gas!");
            vehicle.addFuel(500);
            vehicle.drive(100);
        } finally {
            System.out.println("Car has " + vehicle.getFuel() + " fuel remaining.");
        }
    }
}
