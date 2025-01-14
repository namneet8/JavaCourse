//Write a program to check if number input by user is even or odd

import java.util.*;

public class IfElse_2 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num%2 == 0)
            System.out.println(num + " is even.");
        else
            System.out.println(num + " is odd.");

        sc.close();
    }
}
