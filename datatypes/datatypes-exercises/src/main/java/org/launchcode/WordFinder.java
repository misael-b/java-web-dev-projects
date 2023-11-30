package org.launchcode;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) {
        String phrase = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures " +
                "or conversation?";
        String phraseUppercase = phrase.toUpperCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String userWord = input.next().toUpperCase();
        input.close();

        System.out.println(phraseUppercase.contains(userWord));



    }
}
