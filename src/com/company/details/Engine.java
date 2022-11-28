package com.company.details;

public class Engine {
    private final int power;
    private final String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'';
    }
}
