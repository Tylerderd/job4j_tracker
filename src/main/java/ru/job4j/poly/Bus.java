package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

    @Override
    public void passengers(int number) {
        System.out.println(number + " passengers");
    }

    @Override
    public int fill(int fuel) {
        int fuelPrice = 60;
        return fuel * fuelPrice;
    }
}
