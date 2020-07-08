package acadamy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;

        int myMax = Integer.MAX_VALUE;
        int myMin = Integer.MIN_VALUE;

        System.out.println("The Min is: " + myMin);
        System.out.println("The Max is: " + myMax);
        System.out.println("Busted Max Value = " + (myMax+1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Min Byte = " + myMinByteValue);

        System.out.println("Max Byte = " + myMaxByteValue);

        short myMinshortValue = Short.MIN_VALUE;
        short myMaxshortValue = Short.MAX_VALUE;

        System.out.println("Min short = " + myMinshortValue);

        System.out.println("Max short = " + myMaxshortValue);

        long myLongValue = 100L;
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;

        System.out.println("Min long = " + myMinlongValue);

        System.out.println("Max long = " + myMaxlongValue);

    }
}
