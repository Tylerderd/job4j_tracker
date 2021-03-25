package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Airplane is flying");
    }

    @Override
    public void turn() {
        System.out.println("Airplane tern left");
    }
}
