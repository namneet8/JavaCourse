//Question 1: In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers.

import java.util.*;

public class PracticeQuestions_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd number: ");
        float b = sc.nextFloat();
        System.out.print("Enter 3rd number: ");
        float c = sc.nextFloat();

        float average = (a + b + c)/3f;
        System.out.println("Average: " + average);

        sc.close();
    }
}
