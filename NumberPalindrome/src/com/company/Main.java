package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println((isPalindrome(123 )));

    }
    public static boolean isPalindrome (int number){
        int reverse = 0;
        int temp = number;

        while (number != 0){
            // extracting the first digit and add it to reverse
            int decimal = number % 10;

            // increasing the place value of the digit
            reverse *= 10;
            reverse += decimal;

            //removing the last digit
            number /= 10;

        }

        System.out.println("reverse = " + reverse);
        return temp == reverse;
    }

}
