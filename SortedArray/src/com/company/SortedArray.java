package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] toTest = getIntegers(5);
        printArray(toTest);
        System.out.println();
        printArray(sortIntegers(toTest));


    }


    public static int[] getIntegers (int dimension) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + dimension + " integer values:");
        int [] values = new int[dimension];
        for (int i=0; i < dimension; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] toPrint) {
        for (int i=0; i < toPrint.length; i++) {
            System.out.println("Element " + i + " contents " + toPrint[i]);
        }
    }

    public static int[] sortIntegers (int[] toSort){
        int sortedArray [] = Arrays.copyOf(toSort,toSort.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i=0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i+1];
                    sortedArray[i+1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
