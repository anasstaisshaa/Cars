package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String model, String carClass, int weight, Driver driver, Engine engine, int carrying) {
        super(model, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
