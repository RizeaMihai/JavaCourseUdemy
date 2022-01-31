package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumAndStringArray {

    public static void main(String[] args) {
        int[] original = populateArray(noOfElements());
        System.out.println("Original array is: " + Arrays.toString(original));
        int[] sortedAscending = lowestFirstSort(original);
        System.out.println("Your ascending sorted array is: " + Arrays.toString(sortedAscending));
        int[] sortedDescending = highestFirstSort(original);
        System.out.println("Your descending sorted array is: " + Arrays.toString(sortedDescending));

        String[] originalStringArray = populateStringArray(noOfElements());
        System.out.println("Original string array is: " + Arrays.toString(originalStringArray));
        String[] sortedDescendingString = highestFirst(originalStringArray);
        System.out.println("Your descending sorted string array is: " + Arrays.toString(sortedDescendingString));
        String[] sortedAscendingString = lowestFirst(originalStringArray);
        System.out.println("Your ascending sorted string array is: " + Arrays.toString(sortedAscendingString));

    }

    private static int noOfElements(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    private static int[] populateArray (int elements) {
        Scanner scanner = new Scanner(System.in);
        int[] toBePopulated = new int[elements];
        int element = 0;

        for (int i=0; i < toBePopulated.length; i++) {
            System.out.println("Insert element at index " + i + ": ");
            element = scanner.nextInt();
            toBePopulated[i] = element;
            scanner.nextLine();
        }
        return toBePopulated;
    }

    private static int[] lowestFirstSort (int[] toBeSorted) {
        int[] array = Arrays.copyOf(toBeSorted, toBeSorted.length);
        boolean flag = true;
        int temp = 0;
        while (flag) {
            flag = false;
            for (int i=0; i < array.length-1 ; i++){
                if (array[i] > array[i+1]){
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

    private static int[] highestFirstSort (int[] toBeSorted) {
        int[] array = Arrays.copyOf(toBeSorted, toBeSorted.length);
        boolean flag = true;
        int temp = 0;
        while (flag) {
            flag = false;
            for (int i=0; i < array.length-1 ; i++){
                if (array[i] < array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

    private static String[] populateStringArray (int elements) {
        Scanner scanner = new Scanner(System.in);
        String[] toBePopulated = new String[elements];
        String element = "";

        for (int i=0; i < toBePopulated.length; i++) {
            System.out.println("Insert element at index " + i + ": ");
            element = scanner.nextLine();
            toBePopulated[i] = element;
        }
        return toBePopulated;
    }

    private static String[] highestFirst (String[] toBeSorted) {
        String[] stringArray = Arrays.copyOf(toBeSorted, toBeSorted.length);

        boolean flag = true;
        while (flag){
            flag = false;
            for (int i=0; i < toBeSorted.length - 1; i++){
                if (stringArray[i].compareTo(stringArray[i+1]) < 0){
                    String temp = (stringArray[i+1]);
                    stringArray[i+1] = stringArray[i];
                    stringArray[i] = temp;
                    flag = true;
                }
            }
        }
        return stringArray;
    }

    private static String[] lowestFirst (String[] toBeSorted) {
        String[] stringArray = Arrays.copyOf(toBeSorted, toBeSorted.length);

        boolean flag = true;
        while (flag){
            flag = false;
            for (int i=0; i < toBeSorted.length - 1; i++){
                if (stringArray[i].compareTo(stringArray[i+1]) > 0){
                    String temp = (stringArray[i+1]);
                    stringArray[i+1] = stringArray[i];
                    stringArray[i] = temp;
                    flag = true;
                }
            }
        }
        return stringArray;
    }
}
