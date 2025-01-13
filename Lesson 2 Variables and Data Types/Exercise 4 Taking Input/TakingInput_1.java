//This exercise demonstrates taking input using scanner object
//first import util package using command- import java.util.*
//then create your scanner object in main method using command- Scanner sc = new Scanner(System.in)
// now you can use sc object to take input, e.g. sc.nextInt()
// at last Close the scanner to avoid resource leaks using command- sc.close();
// other methods in Scanner object-
// next()    -> reads only one word 
// nextLine() -> reads the whole line
// nextInt()
// nextByte()
// nextShort()
// nextLong()
// nextFloat()
// nextDouble()
// nextBoolean()
// nextChar() -> there is no such method

import java.util.*;

public class TakingInput_1 {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("demo of next():");
        System.out.print("Enter your full name: ");  
        String firstName = sc.next();
        System.out.println("next() only takes first word before space as input, this is what i could store- " + firstName);
        System.out.println();

        // when you enter full name in next(), it keeps the rest of words in input buffer and use them for the upcoming input statements
        // sc.next(): It reads the first token (word) and leaves the newline character in the input buffer.
        // sc.nextLine(): When called immediately after sc.next(), it consumes the leftover newline character in the buffer, so it skips asking for input and assigns an empty string ("") to fullName.
        // When you finally get to sc.nextInt(), it works as expected.

        //remove below lines to experiment
        // Clear the leftover newline
        sc.nextLine(); // Consume the leftover newline

        System.out.println("demo of nextLine():");
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println("nextLine() can read whole line, so you name is- " + fullName);
        System.out.println();

        System.out.println("demo of nextInt():");
        System.out.print("Enter an integer: ");
        int intVar = sc.nextInt();
        System.out.println("you entered: " + intVar);
        System.out.println();

        System.out.println("demo of nextByte():");
        System.out.print("Enter a number: ");
        byte byteVar = sc.nextByte();
        System.out.println("you entered: " + byteVar);
        System.out.println();

        System.out.println("demo of nextShort():");
        System.out.print("Enter a number: ");
        short shortVar = sc.nextShort();
        System.out.println("you entered: " + shortVar);
        System.out.println();

        System.out.println("demo of nextLong():");
        System.out.print("Enter a number: ");
        long longVar = sc.nextLong();
        System.out.println("you entered: " + longVar);
        System.out.println();

        System.out.println("demo of nextFloat():");
        System.out.print("Enter a number (try 12 and output will be 12.0): ");
        float floatVar = sc.nextFloat();
        System.out.println("you entered: " + floatVar);
        System.out.println();

        System.out.println("demo of nextDouble():");
        System.out.print("Enter a number: ");
        double doubleVar = sc.nextDouble();
        System.out.println("you entered: " + doubleVar);
        System.out.println();

        System.out.println("demo of nextBoolean():");
        System.out.print("Enter true or false: ");
        boolean booleanVar = sc.nextBoolean();
        System.out.println("you entered: " + booleanVar);
        System.out.println();

        // Close the scanner to avoid resource leaks
        sc.close();

    }

}
