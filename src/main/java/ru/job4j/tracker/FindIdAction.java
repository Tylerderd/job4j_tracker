package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        int itemId = input.askInt("Enter item id you want to find:");
        Item item = tracker.findById(itemId);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item with this id wasn't found");
        }
        return true;
    }
}
