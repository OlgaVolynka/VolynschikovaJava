package org.example;

import java.util.ArrayList;

public class Array {

    public static ArrayList<Integer> checkNumbers(double[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (double n : numbers) {
            if (n % 3 == 0) {
                arrayList.add((int) n);
            }
        }
        return arrayList;
    }

}
