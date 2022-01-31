package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value is " + myMinIntValue);
        System.out.println("Integer maximum value is " + myMaxIntValue);
        System.out.println("Busted MIN VALUE = " + (myMinIntValue - 1));
        System.out.println("Busted MAX VALUE = " + (myMaxIntValue + 1));
        int maxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value is " + myMinByteValue);
        System.out.println("Byte maximum value is " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short minimum value is " + myMinShortValue);
        System.out.println("short maximum value is " + myMaxShortValue);
        short bigShortLiteralValue = 32767;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long minimum value is " + myMinLongValue);
        System.out.println("long maximum value is " + myMaxLongValue);
        long myLongValue = 100L;
        long maxLongValue = 9_223_372_036_854_775_807L;
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue/2);

        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);
    }
}
