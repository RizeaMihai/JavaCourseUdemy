package com.company;

import com.company.Series;

public class Main {

    public static void main(String[] args) {
        Series.nSum(10);

        System.out.println("**********************************************************************");

        for (int i=0; i<=10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("**********************************************************************");
        for (int i=0; i<=10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
