// In this eexercise we will write following three programs-
// 1. Taking 2 numbers as input from the user and return the sum
// 2. Taking 2 numbers as input from the user and return the product
// 3. Taking radius as input from the user and return area of a circle

import java.util.*;

public class TakingInput_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Sum of two numbers:");
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum: " + sum);
        System.out.println();

        System.out.println("Product of two numbers:");
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("Product: " + product);
        System.out.println();

        System.out.println("Area of a circle:");
        System.out.print("Enter the radius: ");
        float radius = sc.nextFloat();
        //float area = 3.14 * radius * radius; will give error 
        //because 3.14 is by default double which will make whole expression of type double (type promotion)
        //we cannot implicitly convert double to float
        float area = 3.14f * radius * radius; 
        System.out.println("Area: " + area);

        sc.close();


    }
}
