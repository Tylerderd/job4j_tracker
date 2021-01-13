package ru.job4j.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int remainSticks = 11;
        int count = 2;

        boolean res = true;
        while (res) {
            String switcher = count % 2 == 0 ? "User1" : "User2";
            System.out.println("There are " + remainSticks
                    + " sticks remained. ");
            System.out.println(switcher + ", take 1, 2 or 3 stick, please: ");
            int number = Integer.parseInt(input.nextLine());
            remainSticks -= number;
            if (remainSticks > 0) {
                System.out.println(switcher + " took " + number + " sticks");

            }
            if (remainSticks <= 0) {
                System.out.println(switcher + " won game");
                res = false;
            }
            count++;
        }
    }
}
