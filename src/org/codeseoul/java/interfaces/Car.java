package org.codeseoul.java.interfaces;

public class Car implements IVehicle {

    private int fuelAmount;
    final private int fuelRatePerDistance;

    public Car(int fuelRatePerDistance) {
        this.fuelAmount = 0;
        this.fuelRatePerDistance = fuelRatePerDistance;
    }

    @Override
    public boolean start() {
        System.out.println("I'm starting!");
        return true;
    }

    @Override
    public void drive(int distance) {
        int fuelConsumed = distance * this.fuelRatePerDistance;

        if (fuelConsumed > this.fuelAmount) {
            throw new OutOfFuelException();
        }

        this.fuelAmount -= fuelConsumed;
        System.out.println("I drove " + distance + " distance, using " + fuelConsumed + " fuel. " +
                "I have " + this.fuelAmount + " fuel remaining.");
    }

    @Override
    public int getFuel() {
        return this.fuelAmount;
    }

    @Override
    public void addFuel(int fuelAmount) {
        this.fuelAmount += fuelAmount;
    }
}
