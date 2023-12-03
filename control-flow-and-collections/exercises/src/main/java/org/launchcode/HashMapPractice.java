package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();
            if(!newStudent.equals("")){
                System.out.print("Student ID: ");
                int studentID = input.nextInt();
                students.put(studentID,newStudent);
                input.nextLine();
            }

        }while (!(newStudent.equals("")));

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("\nClass roster:");
            System.out.println("Student: " + student.getValue() + " (ID: " + student.getKey()+")");

        }
    }
}
