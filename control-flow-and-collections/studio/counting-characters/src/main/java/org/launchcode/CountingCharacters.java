package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a phrase or hit ENTER to use default: ");
        String inputPhrase = input.nextLine();
        String phrase;

        if (inputPhrase.equals("")){ //if no phrase is entered - use default
            String originalPhrase = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                    "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                    "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
                    "that, it’s pretty straightforward from there.";
            phrase = originalPhrase.toLowerCase();

        } else { //uses user's phrase
            phrase = inputPhrase.toLowerCase();
        }


        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] arrayOfAlphabet = alphabet.toCharArray();
        char[] charactersInString = phrase.toCharArray();
        HashMap<Character, Integer> letterCount = new HashMap<>();


        //iterates through each character in the data and compares it to letters in the alphabet
        for(Character letter : charactersInString){
            for(Character character : arrayOfAlphabet){
                if(letter.equals(character)){ // if character is a letter of the alphabet (no special characters)
                    if (! letterCount.containsKey(letter)){ //if not already in HashMap- will add letter with value of 1
                        letterCount.put(letter,1);
                    }else { // if letter is in HashMap- adds 1 to value
                        letterCount.put(letter, letterCount.get(letter) + 1);
                    }
                }
            }
        }

        System.out.println("The phrase: \n\n" +  phrase + "\n\nhas the following letters: ");
        for(Map.Entry<Character,Integer> entry : letterCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
