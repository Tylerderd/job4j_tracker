package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Train is riding on rails ");
    }

    @Override
    public void turn() {
        System.out.println("Train turn right");
    }
}
