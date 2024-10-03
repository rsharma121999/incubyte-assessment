package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = "[,\n]";
        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterEndIndex);
            numbers = numbers.substring(delimiterEndIndex + 1);
        }

        String[] numArray = numbers.split(delimiter);
        List<String> negativeNumbers = new ArrayList<>();
        int sum = 0;

        for (String num : numArray) {
            int number = Integer.parseInt(num.trim());
            if (number < 0) {
                negativeNumbers.add(num);
            }
            sum += number;
        }

        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " + String.join(", ", negativeNumbers));
        }

        return sum;
    }

}