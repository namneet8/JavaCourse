// Syntax: 
// variable = condition ? Statement1 : Statement2

public class TernaryOperator {
    public static void main(String args[]){

        // write a program to check if number is even or odd using ternary operator
        int num = 33;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

    }
}
