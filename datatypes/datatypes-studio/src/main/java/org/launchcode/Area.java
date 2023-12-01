package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();


        while (radius < 0){
            System.out.println("Error, Enter a positive number!!!!!");
            input = new Scanner(System.in);
            System.out.println("Enter the radius of the circle");
            radius = input.nextDouble();
        }

        input.close();

        double area = Circle.getArea(radius);
        System.out.println("The area of the circle of radius " + radius + " is " + area);


    }
}
