package com.company.professions;

public class Driver extends People{
    private int experience;
    public Driver(int age, String fullName, int experience) {
        super(age, fullName);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + "Driver{" +
                "experience=" + experience +
                '}';
    }
}
