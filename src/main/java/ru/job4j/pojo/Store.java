package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] product = new Product[3];
        product[0] = milk;
        product[1] = bread;
        product[2] = egg;
        for (Product pr : product) {
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println("replace milk to oil");
        Product oil = new Product("Oil", 11);
        product[0] = oil;
        for (Product pr : product) {
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println("Shown only product.count > 10");
        for (Product pr : product) {
            if (pr.getCount() > 10) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }
}
