package com.lodderb;

public class Main {

    public static void main(String[] args) {
        // width of int is 32 bits
	    int myIntValue = 5 / 3;
	    // width of float is 32 bits
	    float myFloatValue = 5f / 3f;
	    // width of double is 64 bits
	    double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        int myPounds = 50;
        double myKilograms = 0.45359237d * myPounds;
        System.out.println(myPounds + " pounds is " + myKilograms + " kilograms.");


    }
}
