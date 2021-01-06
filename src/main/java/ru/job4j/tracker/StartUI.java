package ru.job4j.tracker;

public class StartUI extends Item {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Kik"));
        tracker.add(new Item("Bomb"));
        tracker.add(new Item("Bottle"));
        tracker.add(new Item("Car"));
        tracker.add(new Item("Skiff"));
        System.out.println(tracker.delete(4));
    }
}
