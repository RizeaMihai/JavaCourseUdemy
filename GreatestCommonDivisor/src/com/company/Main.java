package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor (int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int div = 0;
        for (int i = 1; i <= Math.min(first,second); i++){
            if ((first % i == 0) && (second % i == 0)){
                div = i;
            }
        }
        return div;
    }
}
