package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {

        another.load = another.load + this.load;
        System.out.println("Battery 2 now is: " + another.load);
        this.load = 0;
        System.out.println("Battery 1 now is: " + this.load);
    }

    public static void main(String[] args) {
        Battery b1 = new Battery(100);
        Battery b2 = new Battery(50);
        b1.exchange(b2);
    }
}
