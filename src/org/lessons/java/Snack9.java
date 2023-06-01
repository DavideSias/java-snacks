package org.lessons.java;

public class Snack9 {
    public static void main(String[] args) {
        int somma = 0;
        int contatore = 10;

        for (int i = 1; i <= contatore; i++) {
            somma += i;
        }

        double media = (double) somma / contatore;

        System.out.println("La somma dei primi 10 numeri è: " + somma);
        System.out.println("La media dei primi 10 numeri è: " + media);
    }
}
