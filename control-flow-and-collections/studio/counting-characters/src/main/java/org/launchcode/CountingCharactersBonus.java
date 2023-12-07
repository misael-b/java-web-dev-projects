package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharactersBonus {
    public static void main(String[] args) throws FileNotFoundException {
        //BONUS: Reading from files in Java

        File myObj = new File("/Users/mbarcenas/Desktop/LaunchCode/java-web-dev-projects/control-flow-and-collections/studio/counting-characters/myfile.txt");
        Scanner myReader = new Scanner(myObj);
        String data;

        HashMap<Character, Integer> letterCount = new HashMap<>();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] arrayOfAlphabet = alphabet.toCharArray();


        while (myReader.hasNextLine()) { // returns true if there is another line in the input of this scanner
            //reads the lines in the file name
            data = myReader.nextLine().toLowerCase();

            // creates an array of char from the String in the file
            char[] arrayOfData = data.toCharArray();

            //iterates through each character in the data and compares it to letters in the alphabet
            for(Character letter : arrayOfData){
                for(Character character : arrayOfAlphabet){
                    if(letter.equals(character)){
                        if (! letterCount.containsKey(letter)){ //if not already in HashMap- will add letter with value of 1
                            letterCount.put(letter,1);
                        }else { //if letter in HashMap, will add one to the value
                            letterCount.put(letter, letterCount.get(letter) + 1);
                        }
                    }
                }
            }
        }

        myReader.close();

        for(Map.Entry<Character,Integer> entry : letterCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
