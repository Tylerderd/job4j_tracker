package ru.job4j.tracker;

public class StartUI extends Item {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Kik"));
        tracker.add(new Item("Bocha"));
        System.out.println(tracker.findById(1).getName());
        System.out.println(tracker.replace(1, new Item("Koks")));
        System.out.println(tracker.replace(2, new Item("Viva")));
        System.out.println(tracker.findById(1).getName());
        System.out.println(tracker.findById(2).getId());
    }
}
