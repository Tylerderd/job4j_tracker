package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select >= 0 && select <= 6) {
                if (select == 0) {
                    System.out.println("=== Create a new Item ====");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.add(item);
                    System.out.println("Item was added");
                } else if (select == 1) {
                    System.out.println("=== All your item in items: ===");
                    System.out.println(Arrays.toString(tracker.findAll()));
                } else if (select == 2) {
                    System.out.println("=== Edit item ===");
                    System.out.println("Enter item id where you want to change name:");
                    int itemId = Integer.valueOf(scanner.nextLine());
                    System.out.println("Enter new item name for id #" + itemId);
                    String newName = scanner.nextLine();
                    Item newItem = new Item(newName);
                    boolean res = tracker.replace(itemId, newItem);
                    if (!res) {
                        System.out.println("Enter correct id to replace name");
                    } else {
                        System.out.println("Item name was replaced");
                    }
                } else if (select == 3) {
                    System.out.println("=== Delete item ===");
                    System.out.println("Enter item id you want to delete:");
                    int itemId = Integer.valueOf(scanner.nextLine());
                    boolean res = tracker.delete(itemId);
                    if (!res) {
                        System.out.println("Enter correct id to delete item");
                    } else {
                        System.out.println("Item was deleted");
                    }
                } else if (select == 4) {
                    System.out.println("=== Find item by id ===");
                    System.out.println("Enter item id you want to find:");
                    int itemId = Integer.valueOf(scanner.nextLine());
                    Item item = tracker.findById(itemId);
                    if (item != null) {
                        System.out.println("Item name: " + item.getName()
                                + " Item id " + item.getId());
                    } else {
                        System.out.println("Item with this id wasn't found");
                    }
                } else if (select == 5) {
                    System.out.println("=== Find item by name ===");
                    System.out.println("Enter item name you want to find:");
                    String name = scanner.nextLine();
                    Item[] items = tracker.findByName(name);
                    if (items.length > 0) {
                        System.out.println(Arrays.toString(items));
                    } else {
                        System.out.println("Items with this name wasn't found");
                    }
                } else if (select == 6) {
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
