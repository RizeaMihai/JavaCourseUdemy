package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SumElementsOfArray {
    public static void main (String[] args) {

        int[] example = populateArray(noOfElements());
        System.out.println("The sum of the elements of array " + Arrays.toString(example) + " is " + sumElementsOfArray(example));
        System.out.println("The sum of even elements of arrat " + Arrays.toString(example) + " is " + sumEvenElements(example));
        System.out.println("The sum of odd elements of arrat " + Arrays.toString(example) + " is " + sumOddElements(example));
    }

    private static int noOfElements(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        boolean isAnInt = scanner.hasNextInt();
        int elements = 0;
        if (isAnInt){
            elements = scanner.nextInt();
        } else {
            System.out.println("This is not an int");
        }
        return elements;
    }

    private static int[] populateArray (int elements) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[elements];
        int element = 0;
        for (int i=0; i < array.length; i++ ) {
            System.out.println("Element #" + (i+1) + ": ");
            element = scanner.nextInt();
            array[i] = element;
        }
        return array;
    }

    private static int sumElementsOfArray (int[] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static int sumEvenElements (int[] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    private static int sumOddElements (int[] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
