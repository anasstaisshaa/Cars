package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.People;

public class Car {
    private final String model;
    private final String carClass;
    private final int weight;
    private final People driver;
    private final Engine engine;

    public Car(String model, String carClass, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("GO!");
    }

    public void stop() {
        System.out.println("STOP");
    }

    public void turnRight() {
        System.out.println("Turn Right");
    }

    public void turnLeft() {
        System.out.println("Turn Left");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine;
    }
}
