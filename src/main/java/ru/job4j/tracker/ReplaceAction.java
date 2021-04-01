package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Replace item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int itemId = input.askInt("Enter id ");
        String newName = input.askStr("Enter new item name for id #" + itemId + " ");
        Item newItem = new Item(newName);
        boolean res = tracker.replace(itemId, newItem);
        if (!res) {
            System.out.println("Enter correct id to replace name");
        } else {
            System.out.println("Item name was replaced");
        }
        return true;
    }
}
