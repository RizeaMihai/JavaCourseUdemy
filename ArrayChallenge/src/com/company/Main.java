package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = getIntegers(5);

        printArray(myIntArray);
        System.out.println();
        printArray(sortIntegers(myIntArray));

    }

    public static int[] getIntegers (int number){
        int[] values = new int[number];
        System.out.println("Enter " + number + " integer values:\r");

        for (int i=0; i < values.length ; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray (int [] toPrint) {
        for (int i=0; i < toPrint.length; i++) {
            System.out.println("Element from index " + i + " is " + toPrint[i]);
        }
    }

    public static int[] sortIntegers (int [] toSort){

//        int [] sortedArray = new int[toSort.length];
//        for (int i = 0; i < toSort.length; i++) {
//            sortedArray[i] = toSort[i];
//        }
        int[] sortedArray = Arrays.copyOf(toSort,toSort.length);  // alternativa la liniile 38-41


        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            //element 0   50 --> 160
            //element 1   160 --> 50
            //element 2   40 --> 40
            for (int i=0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
