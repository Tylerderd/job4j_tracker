package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Book b1 = new Book("Pride and Prejudice", 450);
        Book b2 = new Book("The Adventure of Sherlock Holmes", 340);
        Book b3 = new Book("Dracula", 562);
        Book b4 = new Book("The Great Gatsby", 350);
        Book b5 = new Book("Clean Code", 462);
        Book temp;
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;
        books[4] = b5;

        for (int i = 0; i < books.length; i++) {
            Book bookInArray = books[i];
            System.out.println("Book id " + (i + 1) + " is " + books[i].getName());
        }
        System.out.println();
        temp = books[0];
        books[0] = books[2];
        books[2] = temp;

        for (int i = 0; i < books.length; i++) {
            Book bookArray = books[i];
            if (books[i].getName().equals("Clean Code")) {
                System.out.println("Book id " + (i + 1) + " is " + books[i].getName());
            }
        }
    }
}
