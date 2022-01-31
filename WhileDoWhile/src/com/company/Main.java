package com.company;

public class Main {

    public static void main (String[] args) {
//        System.out.println(isEvenNumber(4));
//	    int count = 1;
//	    while (count != 6){
//            System.out.println("Count value is " + count);
//            count ++;
//        }
//
//	    count = 1;
//	    while (true) {
//	        if (count == 6) {
//	            break;
//            }
//            System.out.println("count value is " + count);
//	        count ++;
//        }
//
//        count = 6 ;
//	    do {
//            System.out.println("Count value was " + count);
//            count ++;
//
//            if (count > 100){
//                break;
//            }
//        } while (count !=6);
//    }
        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number is " + number);

            count++;
            if (count >=5){
                break;
            }
        }
        System.out.println("Total even numbers found is " + count);

    }
    public static boolean isEvenNumber ( int number) {
        while ( (number % 2 == 0)){
            return true;
        }
        return false;
    }
}
