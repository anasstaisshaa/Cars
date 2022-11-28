package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private final double speed;
    public SportCar(String model, String carClass, int weight, Driver driver, Engine engine, int speed) {
        super(model, carClass, weight, driver, engine);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + ", SportCar{" +
                "speed=" + speed +
                '}';
    }
}
