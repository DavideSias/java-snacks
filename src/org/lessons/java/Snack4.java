package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una frase e ti dirò se è palindroma: ");
        String str = scan.nextLine().toLowerCase().replaceAll("\\s+", "");
        // System.out.println(str);

        String reversedStr = "";

        for (int i = 0; i < str.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr;
        }

        System.out.println("Stringa al contrario: " + reversedStr);

        if (str.equals(reversedStr)) {
            System.out.println("la frase inserita è palindroma");
        } else {
            System.out.println("la frase inserita NON è palindroma");
        }
    }
}
