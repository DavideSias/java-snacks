package org.lessons.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] firstName = {"Mario", "Andrea", "Davide", "Marco"};
        String[] lastName = {"Rossi", "Bianco", "Sias", "Verde"};
        Random r = new Random();
        for (int i = 0; i < firstName.length; i++) {
            int randomIndex = r.nextInt(0, firstName.length);
            int randomIndex2 = r.nextInt(0, firstName.length);
            System.out.println(firstName[randomIndex] + " " + lastName[randomIndex2]);
        }
    }
}
