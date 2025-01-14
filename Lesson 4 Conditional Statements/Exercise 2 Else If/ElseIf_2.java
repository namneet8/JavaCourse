//Write a program to find largest of three numbers

public class ElseIf_2 {
    public static void main (String args[]){
        int a = 12, b = 22, c = 32;

        if(a >= b && a >= c){
            System.out.println("a is the greatest");
        }
        else if (b >= c){
            System.out.println("b is the greatest");
        }
        else{
            System.out.println("c is the greatest");
        }
    }
    
}
