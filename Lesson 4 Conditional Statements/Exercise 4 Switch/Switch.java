// Syntax:
// switch (variable){
//     case value1: ...... 
//          break;
//     case value2: ...... 
//          break;
//     default: ....
// }

// value1 can be an integer, character, expression, float, double, ....

//write a calculator program that can perform +, -, *, /, % operations
import java.util.*;

public class Switch {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first operand: ");
        double firstOperand = sc.nextDouble();
        System.out.print("Enter second operand: ");
        double secondOperand = sc.nextDouble();
        System.out.print("Enter the operation: ");
        char operation = sc.next().charAt(0);

        double result = 0;
        switch(operation){
            case '+': result = firstOperand + secondOperand;
            break;
            case '-': result = firstOperand - secondOperand;
            break;
            case '*': result = firstOperand * secondOperand;
            break;
            case '/': result = firstOperand / secondOperand;
            break;
            case '%': result = firstOperand % secondOperand;
            break;
            default: System.out.print("Operation noe found.");
        }

        System.out.println(firstOperand + " " + operation + " " + secondOperand + " = " + result);

        sc.close();


    }
    
}
