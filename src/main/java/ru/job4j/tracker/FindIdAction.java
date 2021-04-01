package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    private final Output out;

    public FindIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by id ===");
        int itemId = input.askInt("Enter item id you want to find:");
        Item item = tracker.findById(itemId);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Item with this id wasn't found");
        }
        return true;
    }
}
