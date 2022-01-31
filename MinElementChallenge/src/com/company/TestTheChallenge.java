package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TestTheChallenge {

    public static void main (String[] args) {
//        System.out.println(Arrays.toString(readElements(readInteger())));
        System.out.println("The minimim element of your array is " + findMin(readElements(readInteger())));

    }

    private static int readInteger() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the number of elements: ");
        int number = scan.nextInt();
        return number;
    }

    private static int[] readElements (int elements) {
        Scanner scan = new Scanner(System.in);
        int[] toBeReaded = new int[elements];
        for (int i=0; i < toBeReaded.length; i++) {
            System.out.println("Element at index " + i + " is: ");
            int element = scan.nextInt();
            toBeReaded[i] = element;
        }
        return toBeReaded;
    }

    private static int findMin (int[] toFindMinFrom) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i < toFindMinFrom.length; i++){
            if (toFindMinFrom[i] < min){
                min = toFindMinFrom[i];
            }
        }
        return min;
    }

}
