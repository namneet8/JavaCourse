//Enter cost of 3 items from the user (using float data type)- a pencil, a pen and an eraser.
//You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;

public class PracticeQuestions_3 {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the cost of pencil: $");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of pen: $");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of eraser: $");
        float eraser = sc.nextFloat();

        float bill = pencil + pen + eraser;
        float billAfterTax = bill * ( 1f + 0.18f);
        System.out.println("Bill Before Tax: $" + bill);
        System.out.println("Bill After Tax: $" + billAfterTax);

        sc.close();

    }
    
}
