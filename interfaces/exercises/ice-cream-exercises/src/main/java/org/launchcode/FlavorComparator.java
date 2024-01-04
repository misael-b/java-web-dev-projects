package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
        //sorts alphabetically:
        //return o1.getName().compareTo(o2.getName());

        int counterO1 = 0;
        int counterO2 = 0;

        ArrayList<String> allergensO1 = o1.getAllergens();
        for (String string : allergensO1){
            counterO1 += 1;
        }

        ArrayList<String> allergensO2 = o2.getAllergens();
        for (String string : allergensO2){
            counterO2 += 1;
        }

        return counterO2 - counterO1;

    }
}
