package com.company;

import java.util.Arrays;

public class Series {

    public static void nSum (int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    public static long factorial (int n) {
        if (n==0) {
            return 0;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

//    public static void fibonacci (int n) {
//        int fib0 = 0;
//        int fib1 = 1;
//        int fib;
//        if (n == 0) {
//            System.out.println(fib0);
//        }
//        for (int i = 2; i <= n; i++) {
//            fib = fib0 + fib1;
//            fib0 = fib1;
//            fib1 = fib;
//            System.out.println(fib1);
//        }
//    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long fMinus1 = 1;
        long fMinus2 = 0;
        long fib = 0;
        for (int i = 1; i < n; i++) {
            fib = (fMinus1 + fMinus2);
            fMinus2 = fMinus1;
            fMinus1 = fib;
        }
        return fib;
    }
}

