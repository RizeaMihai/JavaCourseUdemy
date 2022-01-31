package com.company;

public class Main {

    public static void main(String[] args) {

        byte myChalengeByte = 10;
        short myChalengeShort = 20;
        int myChalengeInt = 50;
        long sumOfChalNums = myChalengeByte + myChalengeInt + myChalengeShort;

        long myChalengeLong = 50_000L+10L*(sumOfChalNums);
        System.out.println("My long number from the chalenge is: "+ myChalengeLong);

        short shortTotal = (short) (1000+10*(myChalengeByte+myChalengeInt+myChalengeShort));

    }
}
