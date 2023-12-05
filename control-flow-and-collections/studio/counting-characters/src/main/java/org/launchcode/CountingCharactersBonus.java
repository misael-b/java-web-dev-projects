package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharactersBonus {
    public static void main(String[] args) throws FileNotFoundException {
        //BONUS: Reading from files in Java

        File myObj = new File("/Users/mbarcenas/Desktop/LaunchCode/java-web-dev-projects/control-flow-and-collections/studio/counting-characters/src/main/myfile.txt");
        Scanner myReader = new Scanner(myObj);
        String data;

        HashMap<Character, Integer> letterCount = new HashMap<>();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] arrayOfAlphabet = alphabet.toCharArray();


        while (myReader.hasNextLine()) {
            data = myReader.nextLine().toLowerCase();

            char[] arrayOfData = data.toCharArray();

            for(Character letter : arrayOfData){
                for(Character character : arrayOfAlphabet){
                    if(letter.equals(character)){
                        if (! letterCount.containsKey(letter)){
                            letterCount.put(letter,1);
                        }else {
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
