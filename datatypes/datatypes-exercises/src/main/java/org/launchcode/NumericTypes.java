package org.launchcode;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Length of the Rectangle:");
        int length = input.nextInt();

        System.out.println("Please Enter the Width of the Rectangle:");
        int width = input.nextInt();
        input.close();

        int area = length*width;

        System.out.println("The area of the rectangle is:  " + area);

    }
}
