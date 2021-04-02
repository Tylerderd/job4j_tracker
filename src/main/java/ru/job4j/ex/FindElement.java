package ru.job4j.ex;

public class FindElement extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Index is not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] array = {"kio", "lon", "biy"};
            int res = indexOf(array, "lony");
            System.out.println(res);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
