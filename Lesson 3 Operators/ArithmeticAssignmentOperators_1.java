// Arithmetic operators are of two types- Binary and unary
// Binary arithmetic operators- +, -, *, /, %
// Unary Arithmetic operators- post increment, pre increment, post decrement, pre decrement
// In post increment (a++)/ post decrement (a--), First the value is used and then it is incremented/decremented
// In pre increment (++a)/ pre decrement (--a), First the variable is incremented/decremented and then changed value is used

//Assignment Operators- =, +=, -=, *=, /=, %=


public class ArithmeticAssignmentOperators_1 {
    public static void main (String args[]){
        int a = 10;

        int b = ++a;
        System.out.println("After ++a: a = " + a + ", b = " + b);

        //a = 11
        int c = --a;
        System.out.println("After --a: a = " + a + ", c = " + c);

        //a = 10
        int d = a++;
        System.out.println("After a++: a = " + a + ", d = " + d);

        //a = 11
        int e = a--;
        System.out.println("After a--: a = " + a + ", e = " + e);

        int n = 10;
        System.out.println();
        System.out.println("n += 10 -> n = " + (n += 10));
        System.out.println("n *= 10 -> n = " + (n *= 10));
        System.out.println("n -= 10 -> n = " + (n -= 10));
        System.out.println("n /= 10 -> n = " + (n /= 10));
        System.out.println("n %= 10 -> n = " + (n %= 10));



    }
    
}
