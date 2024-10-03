package org.example;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] numArray = numbers.split(",");
        int sum = 0;
        for (String num : numArray) {
            sum += Integer.parseInt(num.trim());
        }
        return sum;
    }

}

