// In java, numbers like 1, 2, 3, 'a'.. and other constants are called literals
// while the values that can be changed are called variables.. 
// We can define a variable as- int a = 10;
// when this line is executed, a 4 bytes space (because int is of 4 bytes size) will be reserved in memory 
// and will be named a and store 10 in it and it have its own address like 10000 something
// variable names, function names , class names are called identifiers in java

// Java has primitive and non primitive data types
// primitive-
// byte    -> 1 byte    -> -128 to 127
// short   -> 2 bytes
// char    -> 2 bytes   
// boolean -> 1 byte    -> true or false
// int     -> 4 bytes
// long    -> 8 bytes
// float   -> 4 bytes
// double  -> 8 bytes

// String is a non-primitive data type in java for storing strings

public class CreatingVariables_1 {
    public static void main (String args[]){
        byte byteVar = 12; 
        short shortVar = 12;
        char charVar = 'a';
        boolean booleanVar = true;  //must be all lowercase
        int intVar = 123;
        long longVar = 123;
        float floatVar = 12.12f;  //f literal at the end is must, by default 12.12 is of double type
        double doubleVar = 12.12;

        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(charVar);
        System.out.println(booleanVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println();

        // we can change the value of a variable anytime and also assign one variable to other
        intVar = 15;
        System.out.println(intVar);
        intVar = byteVar;
        System.out.println(intVar);




    }
    
}
