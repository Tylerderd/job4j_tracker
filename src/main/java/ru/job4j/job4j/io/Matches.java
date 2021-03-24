package ru.job4j.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int remainSticks = 11;
        int count = 2;
        boolean res = true;
        String switcher = "";
        while (res) {
           switcher = count % 2 == 0 ? "player1" : "player2";
            System.out.println("There are " + remainSticks
                    + " sticks remained. ");
            System.out.println(switcher + ", take 1, 2 or 3 stick, please: ");
            int number = Integer.parseInt(input.nextLine());
            if (number > 0 && number < 4) {
                remainSticks -= number;
                if (remainSticks > 0) {
                    System.out.println(switcher + " took " + number + " sticks");
                }
                if (remainSticks <= 0) {
                    res = false;
                }
                count++;
            } else {
                System.out.println("wrong input, you can pass only 1,2 or 3");
            }
        }
        System.out.println(switcher + " won game");
    }
}
