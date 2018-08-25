package com.lodderb;

public class Main {

    public static void main(String[] args) {

        // int has width of 32 bits
        int myMinIntValue = -2_147_483_648;
        int myMaxIntValue = 2_147_483_647;
        int myTotal = (myMinIntValue/2);

        // byte has a width of 8 bits
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByteTotal = (byte) (myMinByteValue/2);


        // short has a width of 16 bits
        short myMinShortValue = -32_768;
        short myMaxShortValue = 32_767;
        short myNewShortValue = (short) (myMinShortValue/2);

        // long has a width of 64 bits
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        long myNewLongValue = myMinLongValue /2;

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid int number.
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plust the int

        byte myLovelyByte = 10;
        short myLovelyShort = 20;
        int myLovelyInt = 50;
        long myLovelyLongTotal = 50_000L + 10L * (myLovelyByte + myLovelyShort + myLovelyInt);
        short myLovelyShortTotal = (short) (1000 + 10 * (myLovelyByte + myLovelyShort + myLovelyInt));

        System.out.println("Minimum int value = " + myMinIntValue);
        System.out.println("Maximum int value = " + myMaxIntValue);
        System.out.println("myTotal = myMinIntValue / 2 = " + myTotal);
        System.out.println("Minimum byte value = " + myMinByteValue);
        System.out.println("Maximum byte value = " + myMaxByteValue);
        System.out.println("myNewByteTotal = myMinByteValue /2 = " + myNewByteTotal);
        System.out.println("Minimum short value = " + myMinShortValue);
        System.out.println("Maximum short value = " + myMaxShortValue);
        System.out.println("myNewShortValue = myMinShortValue / 2 = " + myNewShortValue);
        System.out.println("Minimum long value = " + myMinLongValue);
        System.out.println("Maximum long value = " + myMaxLongValue);
        System.out.println("myNewLongValue = myMinLongValue / 2 = " + myNewLongValue);
        System.out.println(myLovelyLongTotal);
        System.out.println(myLovelyShortTotal);
    }
}
