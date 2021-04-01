package ru.job4j.tracker;

public class ShowAction implements  UserAction {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== All your items: ===");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            out.println(item);
        }
        return true;
    }
}
