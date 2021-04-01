package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Replace item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        int itemId = input.askInt("Enter id ");
        String newName = input.askStr("Enter new item name for id #" + itemId + " ");
        Item newItem = new Item(newName);
        boolean res = tracker.replace(itemId, newItem);
        if (!res) {
            out.println("Enter correct id to replace name");
        } else {
            out.println("Item name was replaced");
        }
        return true;
    }
}
