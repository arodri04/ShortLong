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



        int myTotal = (myMin / 2);

        byte myNewByte = (byte) (myMinByteValue / 2); //This is Casting, telling the ide to treat this as a byte before it comes out
        short myNewShort = (short) (myMinshortValue / 2);// java uses int by default unless said otherwise

        //Challenge - create byte short and int, then a long and make the long equal to 50000 plus 10 times the sum of the byte short int

        byte byteValue = 3;
        short shortValue = 4;
        int intValue = 5;

        long longValue = (long) (50000L + ((byteValue+shortValue+intValue)*10L));

        System.out.println("The Long Value is: "+ longValue);
    }
}
