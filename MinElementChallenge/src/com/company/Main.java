package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count ");
        int count = scanner.nextInt();
        int[] toFindMinFrom = readIntegers(count);
        System.out.println("The minimum value of your array is " + findMin(toFindMinFrom));

    }

    public static int[] readIntegers(int count) {
        int[] integers = new int[count];
            for (int i=0; i < integers.length; i++) {
                System.out.println("Please enter number # " + (i+1));
                int number = scanner.nextInt();
                scanner.nextLine();
                integers[i] = number;
            }
        return integers;
    }

    private static int findMin (int[] toBeChecked) {
        int min = Integer.MAX_VALUE;

        for (int i=0; i < toBeChecked.length; i++) {
            int element = toBeChecked [i];
            if (element < min) {
                min = element;
            }
        }

        return min;
    }
}
