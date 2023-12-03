package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8};

        // Print all numbers in array:
        for (int j : array) {
            System.out.println(j);
        }


        // Print only odd numbers:
        for (int j : array) {
            if (!(j % 2 == 0)){
                System.out.println(j);
            }

        }



        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        // divide the string at each space and store the individual words in an array:

        String[] arrayOfWords = phrase.split(" ");
        System.out.println(Arrays.toString(arrayOfWords));

        // change the delimiter to split the string into separate sentences.

        arrayOfWords = phrase.split("\\.");
        System.out.println(Arrays.toString(arrayOfWords));

    }


}
