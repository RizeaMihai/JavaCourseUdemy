package com.company;

public class MethodOverloadingChallenge {
    public static void main (String[] args) {
//        int amFeet = 0;                      SOLUTIA MEA
//        int amInchees = 1;
//        double centimeters = calcFeetAndIncheesToCentimeters(amFeet,amInchees);
//        if (centimeters <0){
//            System.out.println("Invalid parameters");
//        } else {
//            System.out.println("Number of centimeters for " + amFeet + " Feet and " + amInchees + " Inches, is: " + centimeters);
//        }
//
//        int nrInchees = 14;
//        double nrFeets = calcFeetAndIncheesToCentimeters(nrInchees);
//        System.out.println("Number of feets from " + nrInchees + " Inchees, is: " + nrFeets);

        calcFeetAndIncheesToCentimeters(6,0);
        calcFeetAndIncheesToCentimeters(157);
    }
    public static double calcFeetAndIncheesToCentimeters (double feet, double inches) {
        if ( feet < 0 || inches < 0 || inches > 12){
            System.out.println("Invalid parameters");
            return -1;
        }
//            return  (( 12 * 2.54 ) * feet + (2.54 * inches)); SOLUTIA MEA

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return (centimeters);

    }

    public static double calcFeetAndIncheesToCentimeters (double inches) {
        if (inches < 0) {
            System.out.println("Invalid value");
            return -1;
        }
//                      SOLUTIA MEA
//            double feet = calcFeetAndIncheesToCentimeters(0,12)/2.54;
//            return inches/feet;
        double feet = (int) inches/12;
        double remainingInchees = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInchees + " inches");
        return calcFeetAndIncheesToCentimeters(feet, remainingInchees);
    }
}

