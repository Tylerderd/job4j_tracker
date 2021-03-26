package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Enter a num: "));
            if (select >= 0 && select <= 6) {
                if (select == 0) {
                    String name = input.askStr("Enter name: ");
                    Item item = new Item(name);
                    tracker.add(item);
                    System.out.println("Item was added");
                } else if (select == 1) {
                    System.out.println("=== All your item in items: ===");
                    Item[] items = tracker.findAll();
                    for (Item item : items) {
                        System.out.println(item.toString());
                    }
                } else if (select == 2) {
                    System.out.println("=== Edit item ===");
                    System.out.println("Enter item id where you want to change name:");
                    int itemId = Integer.valueOf(input.askInt("Enter item"
                            + " id where you want to change name:"));
                    String newName = input.askStr("Enter new item name for id #" + itemId);
                    Item newItem = new Item(newName);
                    boolean res = tracker.replace(itemId, newItem);
                    if (!res) {
                        System.out.println("Enter correct id to replace name");
                    } else {
                          System.out.println("Item name was replaced");
                    }
                } else if (select == 3) {
                    System.out.println("=== Delete item ===");
                    int itemId = Integer.valueOf(input.askInt("Enter item id you want to delete:"));
                    boolean res = tracker.delete(itemId);
                    if (!res) {
                        System.out.println("Enter correct id to delete item");
                    } else {
                        System.out.println("Item was deleted");
                    }
                } else if (select == 4) {
                    System.out.println("=== Find item by id ===");
                    int itemId = Integer.valueOf(input.askInt("Enter item id you want to find:"));
                    Item item = tracker.findById(itemId);
                    if (item != null) {
                        System.out.println(item.toString());
                    } else {
                        System.out.println("Item with this id wasn't found");
                    }
                } else if (select == 5) {
                    System.out.println("=== Find item by name ===");
                    System.out.println("Enter item name you want to find:");
                    String name = input.askStr("Enter item name you want to find:");
                    Item[] items = tracker.findByName(name);
                    if (items.length > 0) {
                        for (Item item : items) {
                            System.out.println(item.toString());
                        }
                    } else {
                        System.out.println("Items with this name wasn't found");
                    }
                } else {
                    run = false;
                    System.out.println("You're exit menu");
                }
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
        System.out.println("Select: ");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
