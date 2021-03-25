package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bus is moving on road");
    }

    @Override
    public void turn() {
        System.out.println("Bus turn back");
    }
}
