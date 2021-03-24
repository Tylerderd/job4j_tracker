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
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean res = index != -1;
        if (res) {
            item.setId(items[index].getId());
            items[index] = item;
            res = true;
        }
        return res;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean res = index != -1;
        if (res) {
            int startPos = index + 1;
            System.arraycopy(items, startPos, items, index, this.size - startPos);
            items[size - 1] = null;
            size--;
        }
        return res;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] itemNames = new Item[this.size];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                itemNames[size] = item;
                size++;
            }
        }
        itemNames = Arrays.copyOf(itemNames, size);
        return itemNames;
    }
}