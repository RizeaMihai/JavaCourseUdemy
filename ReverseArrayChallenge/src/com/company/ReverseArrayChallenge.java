package com.company;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        int[] toTest = {1,5,3,7,11,9,15};
//        System.out.println("original array= " + Arrays.toString(toTest));
        reverse(toTest);

    }

    private static void reverse (int[] toReverse) {
        System.out.println("Array = " + Arrays.toString(toReverse));
        int temp = 0;
        int maxIndex = toReverse.length -1;
        int halfLength = toReverse.length / 2;
        for (int i=0; i < halfLength; i++) {
                temp  = toReverse[i];
                toReverse[i] = toReverse[maxIndex-i];
                toReverse[maxIndex-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString((toReverse)));
    }
}
