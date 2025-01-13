// Type conversion or Widening conversion or Implicit conversion happens when:
// a) type is compatible (int and String are not compatible, but int and short are compatible)
// b) size of destination type is greater than size of source type (size of long is greater than int, hence int can be converted to long)
// size chart-
// byte -> short -> int -> float -> long -> double

import java.util.*;

public class ImplicitConversion_1 {
    public static void main (String args[]){
        //long a = 24;
        //int b = a; this shows up error because long can't be converted to int but vice-versa is true
        int b = 24;
        long c = b;
        System.out.println(c);

        
        Scanner sc = new Scanner(System.in);
        //int number = sc.nextFloat(); throws up error
        float number = sc.nextInt(); //if you enter 12, 12.0 will be stored
        System.out.println(number);

        sc.close();

    }
}
