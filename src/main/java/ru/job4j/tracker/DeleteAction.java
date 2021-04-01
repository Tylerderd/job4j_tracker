package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int itemId = input.askInt("Enter item id you want to delete:");
        boolean res = tracker.delete(itemId);
        if (!res) {
            System.out.println("Enter correct id to delete item");
        } else {
            System.out.println("Item was deleted");
        }
        return true;
    }
}
