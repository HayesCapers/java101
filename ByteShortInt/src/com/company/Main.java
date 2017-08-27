package com.company;

public class Main {

    public static void main(String[] args) {

//        min and max values that can be held in int variables
//        has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
//        System.out.println("myTotal = " + myTotal);

//        min value of a byte (has a width of 8)
        byte myByteValue = -128;
//        this will error because int and bytes are incompatible data types
//        byte myTotal = (myByteValue/2)

//        you must specify the type b/c java converts things to ints automatically
        byte myNewByteValue = (byte) (myByteValue/2);
//        System.out.println("myNewByteValue = " + myNewByteValue);


//        max value of a short
//        has a width of 16
        short myShortValue = 32767;

//        max value of a long
//        has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

//        1. Create a byte variable set to any valid byte

        byte aByte = -102;

//        2. Create a short variable set to any valid short number

        short aShort = 2465;

//        3. Create an int variable set to any valid int number

        int aInt = 1_329_549_293;

//        5. Create a varable of type long, and make it equal to 50000 + 10 times the sum of the byte, plus the short
//        plus the int

        long aLong = 50000 + (10 * (aByte + aShort + aInt));
        short shortTotal = (short) (5000 + 10 * (aByte + aShort + aInt));
        System.out.println(aLong);

    }
}
