package ru.job4j.tracker;

public class Exit implements UserAction {
    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("You're leave tracker.");
        return false;
    }
}
