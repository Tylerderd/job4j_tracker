package ru.job4j.oop.profession;

public class Patient {
    private String name;
    private String illness;

    public Patient(String name, String illness) {
        this.name = name;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public String getIllness() {
        return illness;
    }
}
