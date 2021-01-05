package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean res = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index].setName(item.getName());
            res = true;
        }
        return res;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                itemsWithoutNull[size] = item;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        for (int index = 0; index < itemsWithoutNull.length; index++) {
            System.out.println(itemsWithoutNull[index]);
        }
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] itemNames = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                itemNames[size] = item;
                size++;
            }
        }
        itemNames = Arrays.copyOf(itemNames, size);
        for (int i = 0; i < itemNames.length; i++) {
            System.out.println(itemNames[i]);
        }
        return itemNames;
    }
}