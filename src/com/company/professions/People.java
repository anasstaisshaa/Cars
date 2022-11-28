package com.company.professions;

public abstract class People {
    private int age;
    private final String fullName;

    public People(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
