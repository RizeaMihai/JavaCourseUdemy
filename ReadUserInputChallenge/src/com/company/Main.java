package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10){
            System.out.println("Enter number #"+count);

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid Number");
                count --;
            }
            scanner.nextLine();
            count ++;
        }
        System.out.println("The sum of the entered numbers, is: " + sum);
        scanner.close();
    }
}
