package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = 10;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntVlaue = "+ anotherIntValue);

        anotherIntValue ++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntVlaue = "+ anotherIntValue);


        int [] myIntArray = new int[5];
        int [] anotherArray = myIntArray;

        System.out.println();
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString((anotherArray)));

        anotherArray[0] = 1;
        System.out.println();
        System.out.println("myIntArray after change = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after change  = " + Arrays.toString((anotherArray)));

        System.out.println();
        modify(anotherArray);
        System.out.println("myIntArray after modify = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after modify  = " + Arrays.toString((anotherArray)));

        System.out.println();
        myIntArray = new int[] {4, 5, 6, 7, 8};
        System.out.println("myIntArray after initialize = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after initialize  = " + Arrays.toString((anotherArray)));

    }

    private static void modify (int[] array) {
        array [0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
