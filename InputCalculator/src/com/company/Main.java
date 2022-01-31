package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 1;

            while (true){
                boolean isAnInt = scan.hasNextInt();
                if (isAnInt) {
                    int number = scan.nextInt();
                    sum += number;
                    avg = Math.round((double)sum/count);
                    count++;
                } else {
                    break;
                }
                scan.nextLine();
            }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scan.close();
    }
}
