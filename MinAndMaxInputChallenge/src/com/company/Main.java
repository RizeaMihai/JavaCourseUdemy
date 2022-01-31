package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true; // boolean de tip flag folosit doar pentru a da valoarea primului nr, var min si max liniile 19-22

            while (true){
                System.out.println("Enter number: ");
                boolean isAnInt = scanner.hasNextInt();
                    if (isAnInt){
                        int number = scanner.nextInt();
//                        if (first){
//                            first = false;
//                            min = number;
//                            max = number;
//                        }
                        if (number > max){
                            max = number;
                        }
                        if (number < min){
                            min = number;
                        }
                    } else {
                        break;
                    }
                scanner.nextLine();
            }
        System.out.println("min = " + min + " and max = " + max);
        scanner.close();
    }
//        int temp = 0;
//        int number = 0;
//        int count = 0;
//        int min = 0;
//        int max = 0;
//            while (true){
//                System.out.println("Enter number: ");
//                boolean isAnInt = scanner.hasNextInt();
//                if(isAnInt){
//                    number = scanner.nextInt();
//                    count++;
//                    for (int i = 1; i <= count; i++);{
//                        temp = number;
//                    }
//                }
//                else{
//                    System.out.println("Invalid number");
//                    break;
//                }
//                min = Math.min(temp,number);
//                max = Math.max(temp,number);
//            }
//        System.out.println("The minimum number is: " + min);
//        System.out.println("The maximum number is: " + max);

}
