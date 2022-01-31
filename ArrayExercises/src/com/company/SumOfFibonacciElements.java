package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfFibonacciElements {
    public static void main (String[] args) {
        int elements = noOfElements();
//        int[] fibonacci = new int[elements];
//        System.out.println("The sum of the numbers (from an array) for a fibonacci sequence with " + elements + " elements is " + sumElements(fibonacci));
//        sumElements(elements);
//        System.out.println("The sum of the numbers for a fibonacci sequence with " + elements + " elements is " + sumElements(elements));
        System.out.println("The sum of fibElem with " + elements + " numbers, where 0 < a < b,  is " + sumOfFibElem(elements));
    }

    public static int noOfElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of the fibonacci sequence: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
    public static int sumElements (int[] fibonacci) {
        int[] fibonacciNumber = Arrays.copyOf(fibonacci,fibonacci.length);
        int sum = 0;
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacciNumber.length; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            sum += fibonacci[i];
        }
        return sum + fibonacci[0] + fibonacci[1];
    }

    public static int sumElements (int n){
        if (n < 0) {
            return 0;
        }

        int[] fibonacciNo = new int[n+1];
        fibonacciNo[0] = 0;
        fibonacciNo[1] = 1;
        int sum = 0;
        for (int i=2; i < n+1; i++){
            fibonacciNo[i] = fibonacciNo[i-1] + fibonacciNo[i-2];
            sum += fibonacciNo[i];
        }
        return sum + fibonacciNo[0] + fibonacciNo[1];
    }

    // Calculate the sum of the numbers from a Fibonacci sequence, where 0 < a < b

    private static int sumOfFibElem (int n) {
        int a = 1;
        int b = 2;
        int sum = a + b;
        while (sum < n){
            a = b;
            b = sum;
            sum += b;
        }
        System.out.println("a= " + a + "\n" + "b= " + b + "\n" +  "sum= " + sum);
        return sum;
    }
}
