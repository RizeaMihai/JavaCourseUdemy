package com.company;

public class Main {

    public static void main(String[] args) {

//      System.out.println("Viteza in km/h este:" + SpeedConverter.toMilesPerHour(1.5));
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
     }
}
