package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(414));

    }

    public static int sumDigits (int number){

        if (number <10){
            return -1;
        }
        int sum = 0;
        int decimal;

        while (number > 0){
                // extragem prima zecimala
            decimal = number % 10;
            sum += decimal;

                // drop the least signigicant digit
            number /= 10;
            }
        return sum;
    }

//    public static int sumDigits (int number){
//        int sum = 0;
//        int decimal = 0;
//
//        if (number < 10){
//            return -1;
//        }
//
//        while (number > 0){
//
//            decimal = number % 10;
//            sum += decimal;
//
//            number /= 10;
//        }
//        return sum;
//    }
}



