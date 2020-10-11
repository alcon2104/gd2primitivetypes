package com.dkit.ie.gd2.alexconnolly;

/**
 * Explore Primitive types in java
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //investigateInt();
        //investigateByte();
        //investigateShort();
        //investigateLong();
        //investigateCasting();
        //investigateChallenge();
        //investigateFloat();
        //investigateDouble();
    }

    //8 primitive java types:
    //int, double, float, boolean, char, long, short, byte

    //Static - Method belongs to the class rather than an instance of the class
    private static void investigateInt()
    {
        int myValue = 1000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println(myMaxValue +1);
        System.out.println(myMaxValue -1);

        System.out.println("Min value for an int is " + myMinValue);
        System.out.println("Max value for an int is " + myMaxValue);

        int bigInt = 2_147_483_647;
        System.out.println(bigInt);
    }

    private static void investigateByte()
    {
        byte myValue = 100;

        byte myMinValue = Byte.MIN_VALUE;
        byte myMaxValue = Byte.MAX_VALUE;

        System.out.println((byte) (myMaxValue +1));
        System.out.println((byte) (myMaxValue -1));

        System.out.println("Min value for a byte is " + myMinValue);
        System.out.println("Max value for a byte is " + myMaxValue);
    }

    private static void investigateShort()
    {
        short myValue = 100;

        short myMinValue = Short.MIN_VALUE;
        short myMaxValue = Short.MAX_VALUE;

        System.out.println("Min value for a short is " + myMinValue);
        System.out.println("Max value for a short is " + myMaxValue);

        System.out.println((short) (myMaxValue +1));
        System.out.println((short) (myMaxValue -1));
    }

    private static void investigateLong()
    {
        long myValue = 100;

        long myMinValue = Long.MIN_VALUE;
        long myMaxValue = Long.MAX_VALUE;

        System.out.println("Min value for a long is " + myMinValue);
        System.out.println("Max value for a long is " + myMaxValue);

        System.out.println((long) (myMaxValue +1));
        System.out.println((long) (myMaxValue -1));
    }

    private static void investigateCasting()
    {
        int myMinIntValue = Integer.MAX_VALUE;
        int myTotal = myMinIntValue / 2;
        System.out.println("My total is " + myTotal);

        byte myMinByteValue = Byte.MAX_VALUE;
        System.out.println((byte) myMinByteValue * 2);

    }

    private static void investigateChallenge()
    {
        byte byteValue = 90;
        short shortValue = 620;

        int intValue = 234;

        long longValue = 50000 + (10* (byteValue + shortValue + intValue));
        System.out.println(longValue);
    }

    /*Challenge: Create a byte + short and set them to any valid value
    Create an int and set to any valid value
    Create a long and set to 50000 plus 10 times (sum of byte, int and short)
    Write a function to do this and test it by calling from main
    * */

    private static void investigateFloat()
    {
        
    }

    private static void investigateDouble()
    {

    }

}
