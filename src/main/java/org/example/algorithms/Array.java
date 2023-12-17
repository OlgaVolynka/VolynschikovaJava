package org.example.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Array {

    public static List<Double> checkNumbers(ArrayList<Double> numbers) {
        return numbers.stream()
                .filter(n -> n % 3 == 0)
                .collect(Collectors.toList());

    }
}
