package ru.job4j.tracker;

public class StartUI extends Item {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Kik"));
        System.out.println(tracker.findById(1).getName());
    }
}
