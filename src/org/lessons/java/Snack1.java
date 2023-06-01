package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");

        int number;

        number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println(number);
        } else {
            System.out.println(number + 1);
        }
    }
}
