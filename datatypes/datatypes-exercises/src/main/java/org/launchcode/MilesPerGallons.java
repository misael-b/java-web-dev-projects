package org.launchcode;
import java.util.Scanner;

public class MilesPerGallons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have driven:");
        Double miles = input.nextDouble();

        System.out.println("Please enter the amount of gas you've consumed:");
        Double gas = input.nextDouble();
        input.close();

        Double milesPerGallon = miles/gas;

        System.out.println("Your miles-per-gallon is: " + milesPerGallon + "mpg");


    }
}
