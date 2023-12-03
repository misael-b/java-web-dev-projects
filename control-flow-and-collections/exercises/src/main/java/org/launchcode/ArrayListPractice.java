package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
        arrayOfNumbers.add(48);
        arrayOfNumbers.add(63);
        arrayOfNumbers.add(24);
        arrayOfNumbers.add(77);
        arrayOfNumbers.add(43);
        arrayOfNumbers.add(24);
        arrayOfNumbers.add(12);
        arrayOfNumbers.add(3);
        arrayOfNumbers.add(93);
        arrayOfNumbers.add(23);
        System.out.println(sumOfEvenNumbers(arrayOfNumbers));


        ArrayList<String> arrayOfWords = new ArrayList<>(){{
            add("Hello");
            add("World!");
            add("Java");
            add("Hi");
            add("JavaScript");
        }};
        System.out.println(printWords(arrayOfWords));


        // BONUS: Use the string from the Array Practice section
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> phraseAsList = new ArrayList<String>(Arrays.asList(phrase.split(" ")));
        System.out.println(printWords(phraseAsList));
    }
    public static int sumOfEvenNumbers(ArrayList<Integer> array){
        // find the sum of all the even numbers in an ArrayList
        int total = 0;
        for (int number : array){
            if (number % 2 == 0){
                total += number;
            }
        }
        return total;
    }

    public static ArrayList<String> printWords(ArrayList<String> arrayOfWords) {
        //print out each word in a list that has exactly 5 letters
        ArrayList<String> newArrayOfWords = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length for the search: ");
        int lengthOfWord = input.nextInt();


        for(String word: arrayOfWords){
            if (word.length()>= lengthOfWord){
//                System.out.println(word);
                newArrayOfWords.add(word);
            }
        }

        return newArrayOfWords;
    }
}
