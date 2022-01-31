package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value is " + myMinFloatValue);
        System.out.println("Float maximum value is " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value is " + myMinDoubleValue);
        System.out.println("Double maximum value is " + myMaxDoubleValue);

        int myIntValue = 5 / 3 ;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        float sum = (float) (myFloatValue+myDoubleValue);
        System.out.println("My sunt is: " + sum);
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double poundsWeigth = 200d;
        double kgsWeigth = 0.45359237d*poundsWeigth;
        System.out.println("The number of kilograms related to " + poundsWeigth +" pounds, is " + kgsWeigth + " kgs");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
