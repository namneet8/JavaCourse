// Syntax:
// if (condition){
//     .....
// }
// else{
//     ......
// }


// If the If block or Else block has only statement then we don't need to put brackets
// if (condition)
//     ....
// else
//     ....


//Write a program to find the largest of 2 numbers input by user

import java.util.*;

public class IfElse_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("First number i.e. " + a + " is greater");
        }
        else{
            System.out.println("Second number i.e. " + b + " is greater");
        }

        sc.close();
    
    }
}
