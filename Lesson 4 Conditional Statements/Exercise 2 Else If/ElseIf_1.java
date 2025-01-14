// Syntax:
// if(condition){
//     .....
// }
// else if (condition){

// }
// else{

// }

// Calculate tax on user's income using following criteria-
// income < 5 lakh -> 0%
// 5 lakh - 10 lakh -> 20%
// income > 10 lakh -> 30%

import java.util.*;

public class ElseIf_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your income (in lakhs): ");
        float income = sc.nextFloat();
        float tax = 0;

        if(income < 5){
            tax = 0;
        }
        else if (income >= 5 && income <= 10){
            tax = income * 0.20f;
        }
        else{
            tax = income * 0.30f;
        }

        System.out.println("Calculated tax: " + tax + " lakhs");

        sc.close();

    }
}
