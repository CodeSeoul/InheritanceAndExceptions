package org.codeseoul.java.interfaces;

public class Generator implements IFuelable {

    private int fuelAmount;

    @Override
    public int getFuel() {
        return this.fuelAmount;
    }

    @Override
    public void addFuel(int fuelAmount) {
        this.fuelAmount += fuelAmount;
    }
}
