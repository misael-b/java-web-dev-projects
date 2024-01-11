package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");


        Divide(10,0);
        Divide(4,2);

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> student : studentFiles.entrySet()){
            System.out.println(student.getKey() + ": " + CheckFileExtension(student.getValue()));

        }
    }

    public static void Divide(int x, int y)
    {
//        int answer = 0;
//        if (y == 0){
//            try {
//                throw new ArithmeticException("Can not divide by zero!");
//            } catch (ArithmeticException e) {
//                e.printStackTrace();
//            }
//        } else {
//           return x/y;
//        }
//        return answer;
        try {
            System.out.println(x/y);

        } catch (ArithmeticException e) {
            e.printStackTrace();

        }
        ;

    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName.contains(".java")){
            return 1;
        }
        if (fileName.isEmpty()) {
            try {
                throw new NullPointerException("Missing File Extension!");
            } catch (NullPointerException e) {
                e.printStackTrace();
                return -1;

            }
        }


        return 0;

    }
}