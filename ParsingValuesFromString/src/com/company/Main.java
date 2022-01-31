package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.1221";
        System.out.println("numberAsString = " + numberAsString);

        float number = Float.parseFloat(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number +=1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
