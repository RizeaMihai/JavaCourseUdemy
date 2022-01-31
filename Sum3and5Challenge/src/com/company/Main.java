package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for (int number = 1; number <= 1000; number++) {
            if ((number % 3) == 0 && (number % 5) == 0) {
                count++;
                sum += number;
                System.out.println(number + " can be divided by 3 and 5");
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("The sum of the first 5 numbers that can be divided by 3 and 5 is: " + sum);
    }
}
