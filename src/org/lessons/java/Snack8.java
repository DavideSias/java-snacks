package org.lessons.java;

import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validNumber = false;
        int number;
        int total = 0;
        int divisor = 1000;
        do {
            System.out.print("Insert a 4 digit number: ");
            number = scan.nextInt();
            if (number > 999 && number < 10000) {
                // valid number
                validNumber = true;
            }
        } while (!validNumber);
        System.out.println("You number: " + number);

        // Soluzione con ciclo

        for (int i = 0; i < 4; i++) {
            int numberAdd;
            if (divisor == 1) {
                numberAdd = number % 10;
                total += numberAdd;
            } else {
                numberAdd = number / divisor % 10;
                total += numberAdd;
                divisor = divisor / 10;
            }
        }
        System.out.println(total);


        /* soluzione senza ciclo
        int firstNumber = number / 1000 % 10;
        int secondNumber = number / 100 % 10;
        int thirdNumber = number / 10 % 10;
        int fourthNumber = number % 10;

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
        int total = firstNumber + secondNumber + thirdNumber + fourthNumber;
        System.out.println(total);*/

        scan.close();
    }
}
